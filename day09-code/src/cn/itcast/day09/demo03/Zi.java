package cn.itcast.day09.demo03;

public class Zi extends Fu {
    int num=20;

    public  void method() {
        int num=30;
        System.out.println(num);//成员变量30
        System.out.println(this.num);//本类成员变量20
        System.out.println(super.num);//父类的成员变量10
    }
}
