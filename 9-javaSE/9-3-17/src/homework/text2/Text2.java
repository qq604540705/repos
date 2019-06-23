package homework.text2;

import java.util.ArrayList;

/*第二题:
	1.创建事务描述类Person,包含空参构造、满参构造和以下成员变量:
			学号 id    int类型
			姓名 name  String类型
			年龄 age   int类型
		生成以上成员的get/set方法

	2.根据以下信息创建三个对象,并将他们装入集合
		1-马尔扎哈-45  2-塔利斯塔-36  3-迪丽热巴-25

	3.遍历集合,将其中岁数小于30的对象删除,将余下的对象按照如下格式打印出来
		1-马尔扎哈-45*/
public class Text2 {
    public static void main(String[] args) {
        Person Per1=new Person(1,"马尔扎哈",45);
        Person Per2=new Person(2,"塔利斯塔",36);
        Person Per3=new Person(3,"迪丽热巴",25);
        ArrayList<Person> arr=new ArrayList<Person>();
        arr.add(Per1);
        arr.add(Per2);
        arr.add(Per3);
        for (int a = 0; a < arr.size(); a++) {
            if(arr.get(a).getAge()>30){
                System.out.println(arr.get(a).getId()+"-"+arr.get(a).getName()+"-"+arr.get(a).getAge());
            }else{
                arr.remove(a);
            }
        }
        System.out.println(arr.size());
    }
}
