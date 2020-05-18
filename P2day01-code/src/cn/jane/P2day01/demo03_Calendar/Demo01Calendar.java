package cn.jane.P2day01.demo03_Calendar;

import java.util.Calendar;

/*
Calendar类是一个抽象类，，无法直接拆功能键对象使用。
里面有一个静态方法交getInstance(),该方法返回了Calendar类的子类
static Calendar getInstance()使用默认时区和语言环境获得一个日历
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
    }
}
