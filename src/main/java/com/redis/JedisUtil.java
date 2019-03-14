package com.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by Tjl on 2019/3/14 10:59.
 */



    public class JedisUtil {
        private static String ADDR = "127.0.01";
        private static int PORT = 6379;
//        private static String AUTH = "redis";

        private static int MAX_ACTIVE = 1024;

        private static int MAX_IDLE = 200;

        private static int MAX_WAIT = 10000;

        private static int TIMEOUT = 10000;

        private static boolean TEST_ON_BORROW = true;

        private static JedisPool jedisPool = null;

        static {
            try{
                JedisPoolConfig config = new JedisPoolConfig();
                config.setMaxIdle(MAX_IDLE);
                config.setMaxTotal(3000);
                config.setMaxWaitMillis(MAX_WAIT);
                config.setTestOnBorrow(TEST_ON_BORROW);
                jedisPool = new JedisPool(config,ADDR,PORT,TIMEOUT);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        public synchronized static Jedis getJedis(){
            try{
                if(jedisPool != null){
                    Jedis jedis = jedisPool.getResource();
//                    选择第几个库
                    jedis.select(3);
                    return jedis;
                }else{
                    return null;
                }
            }catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public static void returnResource(final Jedis jedis){
            if(jedis != null){
                jedisPool.returnResource(jedis);
            }
        }
    }

