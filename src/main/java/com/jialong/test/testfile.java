package com.jialong.test;

/**
 * Created by Tjl on 2019/3/22 15:00.
 */
public class testfile {
    public static void main(String[] args) {
        String path = testfile.class.getResource("/").getPath();
        System.out.println(path);

    }
}
