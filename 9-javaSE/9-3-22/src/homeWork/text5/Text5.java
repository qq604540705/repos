package homeWork.text5;
/*第五题:
		根据要求完成以下功能：
		① 定义接口Study，要求如下：
			  定义抽象方法： void studyLine(Line line)
			  定义默认方法： void info()，要求：依次调用stu1()，stu2()
			  定义私有方法： void stu1 (),要求：输出"好好练习，天天向上"
							 void stu2 (),要求：输出"镜头拍烂，月薪百万"


		②定义类Line，包含空参、满参构造和以下成员变量
				基础班学习 basicClass（String 型）
				就业班学习 emplymentClass（String 型）
			生成所有成员变量set/get方法
			定义成员方法：void printLine(),要求：输出"练习路线，基础班学习：xxx，就业班学习：yyy",
				PS： xxx为变量basicClass值，yyy为变量emplymentClass值


		③定义类Student，包含空参、满参构造和以下成员变量
			姓名 name（String 型）
			年龄 age（int型）
        生成所有成员变量set/get方法
		定义成员方法：void studying(Study sy)，要求：输出“xxxx练习中”，然后在方法内依次调用info()，studyLine (Line line)
		PS：xxx为变量name值，参数line需要自行创建并初始化变量basicClass与 emplymentClass


		④ 定义测试类Test，在main方法实现以下功能：
		创建并初始化一个Student对象stu，调用方法 studying(Study sy)
		sy为Study的实现类，需要实现studyLine (Line line)抽象方法，实现要求：调用参数line的printLine()方法;
			示例如下：
				苍井空练习中
				好好练习,天天向上
				镜头拍烂,月薪百万
				学习路线,基础班学习:JAVASE,就业班学习:JAVAEE*/
public class Text5 {
    public static void main(String[] args) {
        Student stu=new Student();
        sy sy = new sy();
        stu.studying(sy);

    }
}
 class sy implements Study{

    @Override
    public void studyLine(Line line) {
        line.printLine();
    }
}
