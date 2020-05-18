package cn.jane.P2day01.demo05_StringBuilder;
/*
    StringBuilder和String可以相互转换：
    StringBuilder->String:可以使用SB的toString方法
    public String toString():将当前SB对象转换为String对象

    String->StringBuilder:
    SB(String str)构造一个字符串生成器，并初始化为指定的字符串内容
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        //String->StringBuilder
        String str="hello";
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder(str);
        //往SB中添加数据
        bu.append("world");
        System.out.println("bu:"+bu);

        //StringBuilder->String
        String s=bu.toString();
        System.out.println("s:"+s);



    }
}
