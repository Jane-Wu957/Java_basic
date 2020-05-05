package cn.itcast.day09.demo06;

public class NewPhone extends Phone{
    @Override
    public void show() {
        super.show();//把父类的show方法拿过来用
        System.out.println("显示姓名");
        System.out.println("显示头像");

    }
}
