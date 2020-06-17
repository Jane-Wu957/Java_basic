package cn.Jane.P2day04.demo02.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的：
        作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一

 */
public class Demo01HashSavePerson {
    public static void main(String[] args) {
        show02();

    }

    /*
        HashMap存储自定义类型键值
        key:Person类型
            Person类型就必须重写HashCode方法和equals方法，以保证key唯一
        value:String类型
            可以重复
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person,String> map=new HashMap<>();
        //往集合中添加元素
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"中国");
        map.put(new Person("普京",18),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");//Person重写hashCode方法和equals方法后，女王英国被女王毛里求斯覆盖，实现key唯一
        //使用entrySet和增强for遍历Map集合
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person,String> entry:set
             ) {
            Person key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"-->"+value);

        }

    }

    /*
        HashMap存储自定义类型键值
        key:String 类型
            String类重写hashCode方法和equals方法，可以保证key唯一
        value:Person类型
            value可以重复（同名同年龄的人视为同一个）

     */
    private static void show01() {//Person类中未重写hashCode方法和equals方法
        //创建HashMap集合
        HashMap<String,Person> map=new HashMap<>();
        //往集合中添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));//key:"北京"与上一个背景重复，故覆盖上一个北京
        //使用keySet增强for遍历Map集合
        Set<String> set=map.keySet();
        for (String key:set
             ) {
            Person value =map.get(key);
            System.out.println(key+"="+value);
            /*
            上海=Person{name='李四', age=19}
            广州=Person{name='王五', age=20}
            北京=Person{name='赵六', age=18}
             */
        }

    }
}
