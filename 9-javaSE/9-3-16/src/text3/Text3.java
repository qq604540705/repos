package text3;
/*第三题：分析以下需求，并用代码实现
	1.老师类Teacher
		属性:
			姓名name
			年龄age
			讲课内容content
		行为:
			吃饭
			讲课
	2.学生类Student
		属性:
			姓名name
			年龄age
			学习内容content
		行为:
			吃饭eat()
			学习study()
	要求:
		1.按照以上要求定义Teacher类和Student类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建每个类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用每个对象的成员方法,打印格式如下:
			年龄为30的周志鹏老师正在吃饭....
			年龄为30的周志鹏老师正在亢奋的讲着Java基础中面向对象的知识........("Java基础中面向对象"代表老师讲课的内容)
			年龄为18的韩光同学正在吃饭....
			年龄为18的韩光同学正在专心致志的听着面向对象的知识....("面向对象"代表学生学习的内容)
			*/
public class Text3 {
    public static void main(String[] args) {
        Student xuesheng=new Student();
        xuesheng.setAge(18);
        xuesheng.setName("韩光同学");
        xuesheng.setContent("面向对象的知识");
        xuesheng.eat();
        xuesheng.study();
        System.out.println("有参构造");
        Student xuesheng1=new Student("韩光同学",18,"面向对象的知识");
        xuesheng1.eat();
        xuesheng1.study();
        System.out.println("------------------------------------");
        Teacher teacher=new Teacher();
        teacher.setAge(30);
        teacher.setContent("Java基础中面向对象的知识");
        teacher.setName("周志鹏老师");
        teacher.eat();
        teacher.study();
        System.out.println("有参构造");
        Teacher teacher1=new Teacher("周志鹏老师",30,"Java基础中面向对象的知识");
        teacher1.eat();
        teacher1.study();
    }
}
