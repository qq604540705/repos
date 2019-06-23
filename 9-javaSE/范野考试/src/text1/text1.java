package text1;

import java.util.ArrayList;

/*21、1.定义User类，包含空参、满参构造、以下成员变量及其get、set方法

姓名 name（Sting 类型）

年龄 age（int 类型）

性别 sex（String 类型）

2.定义测试类Test,完成以下要求：

    ①定义方法，public static ArrayList<User> getUser(ArrayList<User> users)，
    获得年龄大于等于18岁，并且性别为 “男”的User，加入新的集合并返回。

   ②在main方法中完成以下功能：创建5个User对象并赋值，加入ArrayList<User>集合中，
   调用getUser方法，并输出返回的新集合中所有元素信息，格式如下：*/
public class text1 {
    //    ②在main方法中完成以下功能：创建5个User对象并赋值，加入ArrayList<User>集合中，
//   调用getUser方法，并输出返回的新集合中所有元素信息
    public static void main(String[] args) {
        User us1 = new User("张三", 15, "男");
        User us2 = new User("李四", 20, "男");
        User us3 = new User("王五", 22, "男");
        User us4 = new User("古力娜扎", 19, "女");
        User us5 = new User("迪丽热巴", 21, "女");
        ArrayList<User> user = new ArrayList<>();
        user.add(us1);
        user.add(us2);
        user.add(us3);
        user.add(us4);
        user.add(us5);
        ArrayList<User> user2=getUser(user);
        for (int a = 0; a < user2.size(); a++) {
            System.out.println(user2.get(a).name+"  "+user2.get(a).age+"  "+user2.get(a).sex);
    }
}
    /* ①定义方法，public static ArrayList<User> getUser(ArrayList<User> users)，
        获得年龄大于等于18岁，并且性别为 “男”的User，加入新的集合并返回。*/
    public static ArrayList<User> getUser(ArrayList<User> users) {
        ArrayList<User> us = new ArrayList<>();
        for (int a = 0; a < users.size(); a++) {
            User user1 = users.get(a);
            if (user1.getAge() >= 18 && user1.getSex().equals("男")) {
                us.add(users.get(a));
            }
        }
        return us;
    }
}
