package cn.itcast.day10.demo06;
/*
向上转型一定是安全的，没有问题，但有弊端:
对象一旦向上转型为父类，那么就无法调用子类原本特有的内容

解决方案：用对象的向下转型【还原】
 */
public class Demo01Main {

    public static void main(String[] args) {
        //对象的向上转型，就是：父类引用指向子类对象
        Animal animal =new Cat();//本来创建的时候就是一只猫
        animal.eat();

//        animal.catchMouse();//错误写法！

        //向下转型。“还原”
        Cat cat=(Cat)animal;
        cat.catchMouse();//猫抓老鼠

        //下面是错误的向下转型
        //本来new的是一只猫，现在非要转换成狗
        //java.lang.ClassCastException,类转换异常
//        Dog dog =(Dog)animal;
    }
}
