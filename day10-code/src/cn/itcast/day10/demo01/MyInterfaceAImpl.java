package cn.itcast.day10.demo01;

public class MyInterfaceAImpl implements  MyInterfacePrivateA{

    public void methodAnother(){
        //直接访问到了接口中的默认方法，这样是错误的！
//        methodCommon();
    }
}
