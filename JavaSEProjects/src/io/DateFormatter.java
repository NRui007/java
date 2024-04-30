package io;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public static void main(String[] args) throws ParseException {
        // 创建简单日期格式器
        SimpleDateFormat sdf;

        // 打印日期+时间
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("formatted date + time: " + sdf.format(new Date()));

        // 打印日期
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("formatted date: " + sdf.format(new Date()));

        // 反向解析
        String str = "18/04/2024";
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(str);

        System.out.println("Parsed date: " + date);
    }
}
