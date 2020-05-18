package cn.jane.P2day01.demo05_StringBuilder;
/*
StringBuilder的常用方法：
    public StringBuilder append(...):添加任意类型数据的字符串形式，并返回当前对象自身/
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //创建SB对象
          StringBuilder bu=new StringBuilder();
//        //append方法返回的是this，调用方法的对象bu，this==bu
//        StringBuilder bu2= bu.append("abc");//把bu的地址值赋给了bu2
//        System.out.println(bu);
//        System.out.println(bu2);
//        System.out.println(bu==bu2);//比较的是地址 true

        //使用append方法无需接受返回值
//        bu.append("abc");
//        bu.append(1);
//        bu.append(true);
//        bu.append("中");
//        bu.append(8.8);
//        System.out.println(bu);//abc1true中8.8

        /*
        链式编程：方法返回值是一个对象，可以继续调用方法
        */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        bu.append("abc").append(1).append(true).append("中").append(8.8);
        System.out.println(bu);








    }
}
