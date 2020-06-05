package cn.Jane.P2day03.demo02.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点：
        底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("jane");
        System.out.println(set);//[abc, www, jane]无序，与输入元素的顺序无关不允许重复
        System.out.println("==================");

        LinkedHashSet<String> linked=new LinkedHashSet<>();

        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("jane");
        System.out.println(linked);//[www, abc, jane]，有序，与存储元素的顺序一样，不允许重复




    }
}
