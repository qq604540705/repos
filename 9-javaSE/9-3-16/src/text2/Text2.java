package text2;
/*1.猫类Cat
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭eat()
			抓老鼠catchMouse()
	2.狗类Dog
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭()
			看家lookHome()
	要求:
		1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建每个类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
		3.调用每个对象的成员方法,打印格式如下:
			花色的波斯猫正在吃鱼.....
			花色的波斯猫正在逮老鼠....
			黑色的藏獒正在啃骨头.....
			黑色的藏獒正在看家.....		*/
public class Text2 {
    public static void main(String[] args) {
        Cat text2=new Cat();
        text2.setColor("花色的");
        text2.setBreed("波斯猫");
        text2.eat();
        text2.catchMouse();
        System.out.println("使用有参构建");
        Cat text2a=new Cat("花色的","波斯猫");
        text2a.eat();
        text2a.catchMouse();
        System.out.println("---------------------------");
        Dog text2b=new Dog();
        text2b.setColor("黑色的");
        text2b.setBreed("藏獒");
        text2b.eat();
        text2b.home();
        System.out.println("使用有参构建");
        Dog text2c=new Dog("黑色的","藏獒");
        text2c.eat();
        text2c.home();

    }
}
