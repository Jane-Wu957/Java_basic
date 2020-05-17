package cn.jane.P2day01.demo01_Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*
        直接打印独享的地址值没有意义，需要重写Object类中的toString方法
        打印对象的属性（name,age）
     */

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    /*
    Object类的equals方法，默认比较的是两个对象的地址值，无意义
    以下重写equals方法，比较两个对象的属性（name，age）
    问题：
    隐含着一个多态问题
    多态的弊端：无法使用子类特有的内容（属性和方法）
    Object obj=p2=new Person ("古力娜扎"，19)；
    解决:可以使用向下转型（强转）把obj类型转换称Person

     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //使用反射技术，判断o是否是Person类型，等效于obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);//使用Objects类的equals是为了防止空指针异常，即两者其一的name为空的情况
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
