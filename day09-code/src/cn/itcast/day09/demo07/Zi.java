package cn.itcast.day09.demo07;

public class Zi extends Fu {
    public Zi(){
       // super();//默认提供父类无参构造方法
        super(10);//在调用父类重载的构造方法
        System.out.println("子类构造方法！");
    }

    public void methodZi() {
//            super();//错误代码!只有子类构造方法，才能调用父类构造方法
    }


}
