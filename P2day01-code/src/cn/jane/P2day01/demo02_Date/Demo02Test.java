package cn.jane.P2day01.demo02_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        //使用Scanner类中的方法next，获取出生日期
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的出生日期（yyy-MM-dd）：");
        String birthdayDateString = sc.next();
        //解析为Date格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd");
        Date birthdayDate=sdf.parse(birthdayDateString);
        // 把Date的出生日期转换为毫秒值
        long birthdayDateTime = birthdayDate.getTime();
        //获取当前的日期，转换为毫秒值
        long todayTime=new Date().getTime();
        //当前日期毫秒值-出生日期的毫秒值
        long time=todayTime-birthdayDateTime;
        //毫秒差值转换为天（s/1000/60/60/24）
        System.out.print("您从出生到现在已经生活了：");
        System.out.print(time/1000/60/60/24);
        System.out.print("天。");


    }
}
