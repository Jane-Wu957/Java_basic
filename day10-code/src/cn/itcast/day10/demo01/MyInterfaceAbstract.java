package cn.itcast.day10.demo01;
/*
任何版本的Java中，接口都能定义抽象方法。
格式：
public abstract 返回值类型 方法名称（参数列表）；

注意事项：
1.接口中当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2.这两个关键字修饰符，可以选择性地省略。
3.方法的三要素可以随意定义。

接口适用步骤：
1.接口不能直接适用，必须有一个“实现类”来“实现”该接口。
格式：
public class 实现类名称 implements 接口名称{
    //...
}
2.接口的实现类必须覆盖重写（实现）接口中的所有抽象方法。
实现：去掉abstract关键字，加上方法体大括号。
3.创建实现类的对象，进行使用。
 */
public interface MyInterfaceAbstract {
    //以下均是抽象方法
    public abstract void method1();

    abstract void method2();

    public void method3();

    void method4();
}
