package cn.jane.P2day01.demo03_Calendar;



import java.util.Calendar;
import java.util.Date;

/*
Calendar类的常用成员方法：
    public int get(int field):返回给定日历字段的值
    public void ser(int field, int value):将给定的日历字段设定为定制/
    public abstract void ass(int field ,int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
    public Date getTime():返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象

    int field：日历类的字段，可以使用Calendar类的静态成员变量获取

 */
public class Demo02Calendar {
    public static void main(String[] args) {
//        demo01();
//        demo02();
//        demo03();
        demo04();
    }

    private static void demo04() {
        //使用getInstance方法获取Calendar对象
        Calendar c=Calendar.getInstance();

        Date date = c.getTime();//把日历对象转换为日期对象
        System.out.println(date);//Mon May 18 22:14:17 CST 2020
    }

    private static void demo03() {
        //使用getInstance方法获取Calendar对象
        Calendar c=Calendar.getInstance();
        c.add(Calendar.YEAR,-1);//现在的年份减1
        int year=c.get(Calendar.YEAR);//括号内参数传递指定的日历字段（YEAR,MONTH等）
        System.out.println(year);
    }

    private static void demo02() {
        //使用getInstance方法获取Calendar对象
        Calendar c=Calendar.getInstance();

        //设置为1999年
        c.set(Calendar.YEAR,1999);
        c.set(Calendar.MONTH,5);
        c.set(Calendar.DAY_OF_MONTH,20);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
    }

    private static void demo01() {
        //使用getInstance方法获取Calendar对象
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);//括号内参数传递指定的日历字段（YEAR,MONTH等）
        System.out.println(year);

        int month=c.get(Calendar.MONTH);
        System.out.println(month);//西方的月份为0-11月

        int date=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);
    }
}
