package cn.itcast.day11.demo04;
/*
局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】。

备注：从Java8+开始，只要局部变量事实不变，那么final关键字可以省略。

原因：
1.new出来的对象是在堆内存当中。
2.局部变量是跟着方法走的，在栈内存当中。
3.方法运行结束之后，立即出栈，局部变量就会消失。
4.但是new出来的对象会在堆当中持续存在，知道垃圾回收消失。

个人总结:如果局部变量是final的不变的，那么new出来的局部内部类对象即可以把变量拷贝进堆中，持续使用。
 */
public class MyOuter {

    public void methodOuter(){
        int num=10;//所在方法的局部变量
//        num=20;//错误写法
        class MyInner {
            public void methodInner(){
                System.out.println(num);
            }

        }
    }
}
