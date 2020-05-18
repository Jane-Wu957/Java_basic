package cn.jane.P2day01.demo06_Integer;
/*
    基本类型于字符串类型可以相互转换
    基本类型->字符串（String）
       1.基本类型的值+""（最简单）
       2.包装类的静态方法toString（参数），不是Object中的toString（）重载
       3.String类的静态方法

    字符串->基本类型
    包装类的静态方法 parseXXX（""）；

 */
public class Demo03Integer {
    public static void main(String[] args) {
        //基本类型->String
        int i1=100;
        String s1=i1+"";
        System.out.println(s1+200);//100200

        String s2=Integer.toString(100);
        System.out.println(s2+200);//100200

        String s3=String.valueOf(100);
        System.out.println(s3+200);//100200

        //字符串->基本类型
        int i=Integer.parseInt(s1);
        System.out.println(i-10);//90

//        int a=Integer.parseInt("a");//NumberFormatException



    }
}
