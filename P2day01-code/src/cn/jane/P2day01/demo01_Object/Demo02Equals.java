package cn.jane.P2day01.demo01_Object;

public class Demo02Equals {
    public static void main(String[] args) {
        /*
        Person类默认继承了Object类，所以可以使用Object类的equals方法
        boolean equals （Object obj）指示其它对象是否与此对象“相等”。
        equals方法源码:
            public boolean equals(Object obj) {
        return (this == obj);
    }
    参数:
    Object obj:可以传递任意的对象
    ==比较运算符，返回值是一个布尔值 true false
    基本数据类型：比较的是值
    引用数据类型：比较得当是地址值
    this 是谁？是哪个对象调用的方法，方法中的this就是哪个对象；p1调用的equals方法中的this就是p1;
    obj是传递过来的参数，p2;


         */
        Person p1=new Person("迪丽热巴",18);
        Person p2=new Person("迪丽热巴",18);
        System.out.println(p2);
        System.out.println(p1);
        System.out.println(p1.equals(p2));

        //p1=p2;
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1));
    }
}
