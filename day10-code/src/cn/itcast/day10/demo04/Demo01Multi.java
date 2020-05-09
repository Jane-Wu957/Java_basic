package cn.itcast.day10.demo04;

/*
代码中体现多态性，就是：父类引用指向子类对象。
格式：
父类名称 对象名=new 子类名称（）；
或者：
接口名称 独享名=new 实现类名称（）；
 */
public class Demo01Multi {
    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用，指向了右侧子类的对象
        Fu obj=new Zi();

        obj.method();//new的是Zi()，故结果为“子类方法”
        obj.methodFu();//子类无此方法，故往上找结果为“父类特有方法”
    }
}
