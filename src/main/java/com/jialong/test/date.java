package com.jialong.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tjl on 2019/3/29 11:13.
 */
public class date {
    public static void main(String[] args) {
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(day));

        System.out.println(System.currentTimeMillis());
        long l = System.currentTimeMillis();
    }
}
