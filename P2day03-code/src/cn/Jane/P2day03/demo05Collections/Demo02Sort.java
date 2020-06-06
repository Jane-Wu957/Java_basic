package cn.Jane.P2day03.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下:
        public static <T> void sort(list<t> list):将集合中元素按照默认规则排序。

    注意：
        sort(List<t> list)使用前提
        被排序的集合里边存储的元素，必须实现Comparable，重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则：
        自己（this）-参数：升序
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        Collections.addAll(list01,1,3,2);
        System.out.println(list01);//默认是升序

        //public static <T> void sort(list<t> list):将集合中元素按照默认规则排序。
        Collections.sort(list01);//[1,3,2]
        System.out.println(list01);//[1,2,3]

        ArrayList<String> list02=new ArrayList<>();
        Collections.addAll(list02,"a","c","b");
        System.out.println(list02);//[a, c, b]
        Collections.sort(list02);
        System.out.println(list02);//[a, b, c]

        ArrayList<Person> list03=new ArrayList<>();
        list03.add(new Person("张三",19));
        list03.add(new Person("梁山",20));
        list03.add(new Person("吴无",18));
        System.out.println(list03);//[Person{name='张三', age=19}, Person{name='梁山', age=20}, Person{name='吴无', age=18}]
        Collections.sort(list03);
        System.out.println(list03);//[Person{name='吴无', age=18}, Person{name='张三', age=19}, Person{name='梁山', age=20}]



    }
}
