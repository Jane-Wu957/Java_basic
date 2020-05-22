package cn.jane.P2day02.demo03_fanxing;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm=new GenericMethod();

        //调用含有泛型的方法method01，传递什么类型，泛型就是什么类型
        //和C++的方法重载有点类似
        gm.method01(1);
        gm.method01("小明");
        gm.method01(8.8);
        gm.method01(true);

//      gm.method02("静态方法，不建议创建对象使用");
        //静态方法，通过类名.方法名（参数）可直接使用
        GenericMethod.method02("静态方法");
        GenericMethod.method02(1);

    }
}
