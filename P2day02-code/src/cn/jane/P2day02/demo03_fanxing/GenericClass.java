package cn.jane.P2day02.demo03_fanxing;
/*
    定义一个含有泛型的类，模拟ArrayList集合
    泛型是一个未知的数据类型，当我们不确定使用什么类型的数据类型的时候，可以使用泛型
    泛型可以接收任意的数据类型
    创建对象的时候确定泛型的数据类型

 */
public class GenericClass<E> {//此处比普通的类多了<E>
    private E name;//平时的String位置换成了  E，以下同理

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
