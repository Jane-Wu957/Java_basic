package cn.jane.P2day01.demo04_System;

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
//        demo01();
        demo02();
    }

    /*
    数组复制，例子:src[1,2,3,4,5]的前三个元素覆盖 dest[6，7，8，9，10]的前三个元素

     */
    private static void demo02() {
        //定义源数组
        int[] src={1,2,3,4,5};
        //定义目标数组dest
        int[] dest={6,7,8,9,10};
        System.out.println("复制前："+ Arrays.toString(dest));
        //使用System.arraycopy进行复制
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+ Arrays.toString(dest));


    }

    /*
    public static long currentTimeMillis():返回以毫秒为单位的当前时间
    用来描述程序的效率
    例题:验证for循环打印数字1-9999所需要使用的时间（毫秒）
     */
    private static void demo01() {
        long s = System.currentTimeMillis();
        for (int i = 1; i <=9999 ; i++) {
            System.out.println(i);

        }
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时："+(e-s)+"毫秒。");


    }
}
