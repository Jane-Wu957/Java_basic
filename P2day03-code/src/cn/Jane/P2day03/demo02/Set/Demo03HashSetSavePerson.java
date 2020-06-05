package cn.Jane.P2day03.demo02.Set;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素

    set集合报错元素唯一：
        存储的元素（String,Integer,...Student,Person...），必须重写hashCode方法和equals放啊发
    要求：
        同名同年龄的人视为同一个人,只能存储一次
 */
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> set=new HashSet<>();
        Person p1=new Person("小美女",18);
        Person p2=new Person("小美女",18);
        Person p3=new Person("小美女",19);
        System.out.println(p1.hashCode());//189568618  重写equals 和 hashCode之后：734175839
        System.out.println(p2.hashCode());//793589513  重写equals 和 hashCode之后：734175839

        System.out.println(p1==p2);//false 重写之后：还是false
        System.out.println(p1.equals(p2));//false   重写equals 和 hashCode之后：true
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);//重写之后：[Person{name='小美女', age=19}, Person{name='小美女', age=18}]，即保证11行要求



    }
}
