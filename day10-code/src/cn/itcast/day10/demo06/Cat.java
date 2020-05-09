package cn.itcast.day10.demo06;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃🐟");
    }
//子类特有方法
    public void catchMouse(){
        System.out.println("🐱抓🐀");
    }
}
