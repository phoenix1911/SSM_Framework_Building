package com.jialong.test;

/**
 * Created by Tjl on 2019/3/22 15:00.
 */
public class testfile {
    public static void main(String[] args) {
        String string = "\\title\\高校毕设\\教师信息模板 (2).xlsx";
        String[] split = string.split("\\\\");
        for (String s :split) {
            System.out.println(s);
        }
        System.out.println(split[split.length-1]);
    }
}
