package homeWork.text5;
/*① 定义接口Study，要求如下：
			  定义抽象方法： void studyLine(Line line)
			  定义默认方法： void info()，要求：依次调用stu1()，stu2()
			  定义私有方法： void stu1 (),要求：输出"好好练习，天天向上"
							 void stu2 (),要求：输出"镜头拍烂，月薪百万"*/
public interface Study {
    abstract void studyLine(Line line);
    default void info(){
        stu1();
        stu2();
    }
    private void stu1(){
        System.out.println("好好练习,天天向上");
    }
    private void stu2(){
        System.out.println("镜头拍烂,月薪百万");
    }
}
