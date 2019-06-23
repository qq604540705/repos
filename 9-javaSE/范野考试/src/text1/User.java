package text1;
/*1.定义User类，包含空参、满参构造、以下成员变量及其get、set方法*/
/*姓名 name（Sting 类型）

        年龄 age（int 类型）

        性别 sex（String 类型）*/
public class User {
    String name;
    int age;
    String sex;

    public User() {
    }

    public User(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
