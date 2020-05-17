package cn.jane.P2day01.demo02_Date;
/*

时间原点（0毫秒）：1970年1月1日00：00：00（英国格林威治时间）
注意:
中国属于东八区，会把时间增加8个小时
1970年1月1日 08：00：00

把毫秒转换为日期：

1天=24*60*60=86400秒=86400000毫秒
 */
public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统时间到1970年1月1日00：00：00经历了多少毫秒

    }
}
