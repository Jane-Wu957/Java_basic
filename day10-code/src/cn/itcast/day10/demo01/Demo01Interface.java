package cn.itcast.day10.demo01;

/*
接口就是多个公共规范
接口是一种引用数据类型，最重要的内容就是其中的：抽象方法。
如何定义一个接口：
public interface 接口名称{
    //接口内容
}
备注：换成了关键字interface之后。编译生成的字节码文件仍然是：java-->.class。
Java7，接口中可以包含的内容由：
1.常量
2.抽象方法

Java8,还额外包含：
3.默认方法
4.静态方法

Java9,额外包含：
5.私有方法

注意事项：
如果实现类没有覆盖重写接口中的所有抽象方法，那么这个实现类必须是抽象类。
 */
public class Demo01Interface {
    public static void main(String[] args) {
        //错误写法！不能直接new接口对象使用。
//        MyInterfaceAbstract inter =new MyInterfaceAbstract();

        //创建实现类的对象使用
        MyInterfaceAbstractImpl impl =new MyInterfaceAbstractImpl();
        impl.method1();
        impl.method2();
    }


}
