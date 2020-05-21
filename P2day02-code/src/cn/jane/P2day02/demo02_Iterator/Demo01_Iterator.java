package cn.jane.P2day02.demo02_Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
    java.util.Iterator接口：迭代器（对集合进行遍历）
    有两个方法：
        boolean hasNext() 如果仍有元素可以迭代，则返回true。
            判断集合中还有没有下一个元素
        E next() 返回迭代的下一个元素
            取出集合中的下一个元素
    Iterator迭代器是一个接口，无法直接使用，要用其实现类对象，获取实现类方法是比较特殊
    Collection接口中有一个方法叫iterator（），这方法返回的是迭代器的实现类对象
        Iterator<E> iterator() 返回在此collection的元素上进行迭代的迭代器。

    迭代器使用步骤（重点）：
        1.使用集合中的方法iterator（）获取迭代器的实现类对象，使用Iterator接口接收（多态）
        2.使用Iterator接口中的方法hasNext判断是否还有元素
        3.使用next取元素
 */
public class Demo01_Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll=new ArrayList<>();
        //往集合中添加元素
        coll.add("姚明");
        coll.add("科比");
        coll.add("詹姆斯");
        coll.add("杜兰特");

        /*
        1.获取实现类对象
        注意：Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型

         */

        Iterator<String> it=coll.iterator();//Iterator类应该是java.util.Iterator

        //判断
        boolean b=it.hasNext();
        System.out.println("b:"+b);

        //迭代器取出过程是一个重复的过程，可以使用while循环（不知道循环次数）
        //循环结束调教：hasNext（）返回false

        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        System.out.println("================");
        //对于for循环，了解一下即可
        for(Iterator<String> it2=coll.iterator();it2.hasNext();){
            String e=it2.next();
            System.out.println(e);
        }
//        String s = it.next();
//        System.out.println(s);//姚明
//
//        b=it.hasNext();
//        System.out.println("b:"+b);
//        //取出
//         s = it.next();
//        System.out.println(s);//科比
//        b=it.hasNext();
//        System.out.println("b:"+b);
//        //取出
//        s = it.next();
//        System.out.println(s);//詹姆斯
//
//        b=it.hasNext();
//        System.out.println("b:"+b);
//        //取出
//        s = it.next();
//        System.out.println(s);//杜兰特

//        boolean b1 = it.hasNext();
//        System.out.println("b1:"+b1);//false
//        s=it.next();
//        System.out.println(s);//没有元素，再取会抛出异常：NoSuchElementException


    }
}
