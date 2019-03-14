package com.jialong.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by Tjl on 2019/3/14 10:59.
 */
@Component
public class JedisUtil {

    //spring的@Autowired不能用在静态里 可以使用set方法
    private static JedisPool jedisPool;

    @Autowired
    public void setJedisPool(JedisPool setjedisPool) {
        JedisUtil.jedisPool = setjedisPool;
    }

    synchronized static Jedis getJedis() {
        Jedis jedis = null;
        try {
            if (jedisPool != null) {
                jedis = jedisPool.getResource();
                return jedis;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void returnResource(final Jedis jedis) {
        if (jedis != null) {
            jedisPool.returnResource(jedis);
        }
    }
}

