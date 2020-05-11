package cn.itcast.day11.demo01;

/*
当final关键字用来修饰一个类的时候，格式：
public final class 类名称{
    //...
}
含义:当前这个类不能含有任何的子类。（太监类）
注意：一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写。
 */
public final class MyClass /*extends Object*/{
    public static void main(String[] args) {
        System.out.println("方法执行");
    }
}
