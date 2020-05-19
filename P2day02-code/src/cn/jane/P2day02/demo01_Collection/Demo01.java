package cn.jane.P2day02.demo01_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll=new ArrayList<>();
        System.out.println(coll);//重写了toString方法， []
    }

}
