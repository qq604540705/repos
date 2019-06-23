package homeWork.text5;

/*③定义类Student，包含空参、满参构造和以下成员变量
			姓名 name（String 型）
			年龄 age（int型）
        生成所有成员变量set/get方法
		定义成员方法：void studying(Study sy)，要求：输出“xxxx练习中”，然后在方法内依次调用info()，studyLine (Line line)
		PS：xxx为变量name值，参数line需要自行创建并初始化变量basicClass与 emplymentClass*/
public class Student {
    String name;
    int age;

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
    public void studying(Study sy){
        System.out.println(name+"练习中");
        sy.info();
        Line line = new Line("JAVASE","JAVAEE");
        sy.studyLine(line);
    }
}
