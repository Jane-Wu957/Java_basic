package cn.jane.P2day01.demo05_StringBuilder;
/*
    java.lang.StringBuilder类:字符串缓冲区，可以提高字符串的效率
    构造方法：
    StringBuilder()构造一个不带任何字符的字符串生成器，其初始容量为16个字符。
    StringBuilder(String str)构造一个字符串生成器，并初始化为指定字符串内容。

 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        //空参数构造方法
        StringBuilder BU1 = new StringBuilder();
        System.out.println("BU1:"+BU1);//BU1: ""

        //带字符串的构造方法
        StringBuilder BU2 = new StringBuilder("abc");
        System.out.println("BU2:"+BU2);//BU2:abc
    }
}
