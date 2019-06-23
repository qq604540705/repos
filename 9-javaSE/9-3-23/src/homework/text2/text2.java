package homework.text2;

import java.util.ArrayList;

/*22.【代码题】编号:SJ028531本题分数:30分  *难度：
1.定义Person类，包含空参、满参构造、以下成员变量及其get、set方法
姓名 name（Sting 类型）
年龄 age（int 类型）
性别 sex（String 类型）
2.在测试类中定义方法，ArrayList<Person> getPerson(ArrayList<Persoon> persons)，将性别为 “女”,
    并且年龄小于20岁的person，加入新的集合并返回
 3.在测试类中，创建3个person对象并赋值，加入ArrayList<Person>集合，调用上面定义的 getPerson()方法，
    并打印返回的新集合中的元素信息*/
public class text2 {
    public static void main(String[] args) {
        Person p1 = new Person("古力娜扎", 19, "女");
        Person p2 = new Person("马尔扎哈", 29, "男");
        Person p3 = new Person("123", 19, "女");
        ArrayList<Person> per2 = new ArrayList<>();
        per2.add(p1);
        per2.add(p2);
        per2.add(p3);

        ArrayList<Person> person4 = getPerson(per2);
        for (int a = 0; a < person4.size(); a++) {
            System.out.println("名字:"+person4.get(a).name+"  年龄为:"+person4.get(a).getAge()+"  性别为:"+person4.get(a).getSex());
        }

    }

    public static ArrayList<Person> getPerson(ArrayList<Person> persons) {
        ArrayList<Person> per = new ArrayList<>();
        for (int a = 0; a < persons.size(); a++) {
            Person person1 = persons.get(a);
            if (person1.getSex().equals("女") && person1.getAge() < 20) {
                per.add(person1);
            }
        }
        return per;
    }
}


