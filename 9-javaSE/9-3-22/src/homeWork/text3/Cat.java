package homeWork.text3;
/*定义一个Cat类,实现Animal接口,
					实现抽象方法:run(),输出"奔跑的猫毛都被撸秃了"
					定义自己特有的方法: catchMouse(),输出"猫抓老鼠"		*/
public class Cat implements Animal {

    @Override
    public void run() {
        System.out.println("奔跑的猫毛都被撸秃了");
    }
    public void catchMouse(){
        System.out.println("猫爪老鼠");
    }
}
