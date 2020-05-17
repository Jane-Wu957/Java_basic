package cn.jane.P2day01.demo01_Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {
    public static void main(String[] args) {
        //默认继承了Object类，所以可以使用Object类中的toString方法
        //String toString() 返回对象的字符串表示。
        Person p=new Person("张三",18);
        String s = p.toString();
        System.out.println(s);//与11行显示相同，就是p的地址值
        //直接打印对象的名字，其实就是调用对象的toString,p=p.toString();
        System.out.println(p);

        //看一个类是否重写了toString,直接打印这个类的对象即可
        //如果没有重写toString 那么打印的是地址值。
        Random r=new Random();
        System.out.println(r);

        Scanner sc=new Scanner(System.in);//显示的不是地址值，说明重写了toString
        System.out.println(sc);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);//[1,2],重写了toString（）；


    }
}
