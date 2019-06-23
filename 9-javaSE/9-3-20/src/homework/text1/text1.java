package homework.text1;
/*第一题:
	1.定义一个Animal类,包含如下行为:
		eat()  打印"要吃饭"
		run()  打印"会跑步"
		sleep() 打印"要睡觉"
	2.定义一个Dog类,继承Animal类,重写eat(),run()方法
		定义自己特有的行为 :
			cry() 打印"狗会汪汪叫"
	3.定义测试类DogTest, 创建Dog的对象,依次调用eat(),run(),sleep(),cry()方法,打印出如下语句
			狗要吃那啥
			狗跑的如脱缰的野狗
			要睡觉
			狗会汪汪叫*/
public class text1 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.run();
        dog.sleep();
        dog.cry();
    }
}
