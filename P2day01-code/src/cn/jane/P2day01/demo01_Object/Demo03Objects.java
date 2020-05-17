package cn.jane.P2day01.demo01_Object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1=null;//null是不能调用方法的，就会抛出空指针异常
        String s2="ABC";
//        boolean s = s1.equals(s2);//空指针异常：NullPointerException

        /*
        Objects类的equals方法：对两个对象进行比较，防止空指针异常
            public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }
         */
        boolean b2=Objects.equals(s1,s2);
        System.out.println(b2);
//        System.out.println(s);
    }
}
