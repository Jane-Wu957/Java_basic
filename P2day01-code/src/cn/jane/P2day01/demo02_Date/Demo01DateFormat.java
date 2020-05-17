package cn.jane.P2day01.demo02_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.DateFormat:是日期/时间格式化子类的抽象类
    作用：
    格式化（日期->文本）、解析（文本->日期）
    String format(Date date) 按照指定的模式，把Date日期，格式化为符合模式的字符串
    Date parse（String source）把符合模式的字符串，解析为Date日期
    DateFormat类是一个抽象类，无法直接创建对象使用，可以使用其子类

    java.text.SimpleDateFormat extends Date Format

    构造方法：
    SimpleDateFormat（String pattern）
    用给定的模式和默认语言环境的日期格式符号构造
 */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
       // demo01();
        demo02();

    }

    /*使用DateFormat类中的方法parse，把文本解析为日期
    使用步骤：
    1.创建对象。构造指定模式
    2.调用parse方法
    注意：
    parse方法声明了一个异常叫ParseException
    如果字符串和构造方法的模式不一样，那么程序就会抛出此异常
    调用一个抛出了异常的方法，就必须处理这个异常，要么throws继续抛出这个异常，要么try catch 自己处理

     */
   private static void demo02() throws ParseException {
       SimpleDateFormat  sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
       Date date = sdf.parse("2020年05月17日 11时00分35秒");//alt+enter处理异常，此处用了声明
       System.out.println(date);


   }

   /*使用DateFormat类中的方法format，把日期格式化为文本
     步骤：
     1.创建对象，构造模式
     2.创建方法format，按指定模式，Date->字符串（文本）
     注意：模式中的连接符号可以改，但是对应的字母不能改
    */
    private static void demo01() {
        //1.创建对象
        SimpleDateFormat  sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //2.调用方法
        Date date=new Date();
        String d = sdf.format(date);
        //原日期
        System.out.println(date);
        //格式化之后的日期
        System.out.println(d);


    }
}
