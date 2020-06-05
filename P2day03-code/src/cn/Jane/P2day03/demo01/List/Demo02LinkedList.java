package cn.Jane.P2day03.demo01.List;

import java.util.LinkedList;

/*
    java.util.LinkedList 集合implements List 接口
    LinkedList 集合的特点：
        1.底层是一个链表结构：查询慢，增删快
        2.里面包含了大量操作首尾元素的方法
        注意：使用LinkedList集合特有的方法，不能使用多态

        public void addFirst(E e) :将指定元素插入此列表的开头。
        public void addLast(E e) :将指定元素添加到此列表的结尾。
        public void push(E e) :将元素推入此列表所表示的堆栈。//等价于addFirst

        public E getFirst() :返回此列表的第一个元素。
        public E getLast() :返回此列表的后一个元素。

        public E removeFirst() :移除并返回此列表的第一个元素。
        public E removeLast() :移除并返回此列表的后一个元素。
        public E pop() :从此列表所表示的堆栈处弹出一个元素。//等价于removeFirst

        public boolean isEmpty() ：如果列表不包含元素，则返回true。

 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show03();

    }

    /*
        public E removeFirst() :移除并返回此列表的第一个元素。
        public E removeLast() :移除并返回此列表的后一个元素。
        public E pop() :从此列表所表示的堆栈处弹出一个元素。//等价于removeFirst
     */
    private static void show03() {
        //创建LinkedList集合对象。不能使用多态！
        LinkedList<String> linked =new LinkedList<>();
        //使用add方法往集合种添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        //String first = linked.removeFirst();
        String first=linked.pop();//a
        System.out.println("移除的第一个元素："+first);//移除的第一个元素：a
        String last = linked.removeLast();
        System.out.println("移除的最后一个元素："+last);//移除的最后一个元素：c
        System.out.println(linked);//[b]

    }

    /*
        public E getFirst() :返回此列表的第一个元素。
        public E getLast() :返回此列表的后一个元素。
     */
    private static void show02() {
        //创建LinkedList集合对象。不能使用多态！
        LinkedList<String> linked =new LinkedList<>();
        //使用add方法往集合种添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        //linked.clear();//清空集合中的元素；
        if(!linked.isEmpty()) {//防止46行所说的异常
            String first = linked.getFirst();
            System.out.println(first);//a；执行clear之后，再获取集合中的元素，抛出异常：NoSuchElementException
            String last = linked.getLast();
            System.out.println(last);//c
        }
    }

    /*
        public void addFirst(E e) :将指定元素插入此列表的开头。
        public void addLast(E e) :将指定元素添加到此列表的结尾。
        public void push(E e) :将元素推入此列表所表示的堆栈。//等价于addFirst
     */
    private static void show01() {
        //创建LinkedList集合对象。不能使用多态！
        LinkedList<String> linked =new LinkedList<>();
        //使用add方法往集合种添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        // public void addFirst(E e) :将指定元素插入此列表的开头。
        //linked.addFirst("www");
        System.out.println(linked);//[www, a, b, c]
        //public void push(E e) :将元素推入此列表所表示的堆栈。//等价于addFirst
        linked.push("www");//[www, a, b, c]
        System.out.println(linked);

        //public void addLast(E e) :将指定元素添加到此列表的结尾。
        linked.addLast("com");
        System.out.println(linked);//[www, a, b, c, com]





    }
}
