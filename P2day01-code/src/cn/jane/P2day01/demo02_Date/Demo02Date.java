package cn.jane.P2day01.demo02_Date;


import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();//按"Alt+enter创建方法line8"
        demo02();//带参数构造方法
        demo03();
    }
/*
long getTime() 把日期转换为毫秒值（相当于System.currentTimeMillis()方法）
返回自 1970年1月1日00：00：00 GMT以来此Date对象表示的毫秒数
 */
    private static void demo03() {
        Date date=new Date();
        long time= date.getTime();
        System.out.println(time);//1589683308822L

    }

    /*
    Date的带参数构造方法
    Date（long date）:传递毫秒值，把毫秒值转换为Date日期
     */
    private static void demo02() {
        Date date=new Date(0L);
        System.out.println(date);

        date=new Date(1589683095583L);
        System.out.println(date);
    }

    /*
    Date类的空参数构造方法
    Date（）获取当前系统的日期和时间
     */
    private static void demo01() {
        Date date=new Date();
        System.out.println(date);
    }
}
