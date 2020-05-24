package cn.jane.P2day02.demo03_fanxing;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型的通配符：
        ？：代表任意的数据类型
    使用方式：
        不能创建对象使用
        只能作为方法的参数使用
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02=new ArrayList<>();
        list02.add("a");
        list02.add("b");

//        ArrayList<?> list03=new ArrayList<?>();//错误代码，？不能作为创建对象的类型使用


        printArray(list01);//31行参数用ArrayList<String> list)时此处报错
        printArray(list02);//31行参数用ArrayList<Integer> list)时此处报错

        /*
        定义一个方法，能遍历所有类型的AL集合
        这时候我们不知道AL集合使用什么数据类型，可以用泛型的通配符？来接收数据类型
        注意：
            泛型没有继承概念，所以31行方法参数不能用Object
         */

    }
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator<?> it=list.iterator();
        while(it.hasNext()){
            //it.next()方法，取出的元素时Object,可以接收任意的数据类型
            Object o=it.next();
            System.out.println(o);
        }

    }

}
