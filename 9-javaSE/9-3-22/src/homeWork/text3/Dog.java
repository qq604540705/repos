package homeWork.text3;
/*	定义一个Dog类,实现Animal接口,
					实现抽象方法:run(),输出"如脱缰的野狗一样奔跑"
					定义自己特有的方法: eat(),输出"狗吃屎"*/
public class Dog implements Animal {

    @Override
    public void run() {
        System.out.println("如脱缰的野狗一样奔跑");
    }
    public void eat(){
        System.out.println("狗吃屎");
    }
}
