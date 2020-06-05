package cn.Jane.P2day03.demo02.Set;

import java.util.HashSet;

/*
    Set不允许重复元素的原理：
    先拿到元素的哈希值，在集合中寻找有无此哈希值的元素，无则添加元素进集合，
    有则判断集合中与此元素哈希值相同的元素是否相等，若相等则不添加此元素进集合，否则添加。

    总结：即保证集合中无重复元素，而当同一个哈希值下的元素个数超过8个，则用红黑树装载这些元素
 */
public class Demo02HashSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        String s1=new String("abc");
        String s2=new String("abc");
        set.add(s1);
        set.add(s1);
        set.add("重地");//和“通话”的哈希值相同
        set.add("通话");
        set.add(s1);
        System.out.println(set);//[重地, 通话, abc]


    }
}
