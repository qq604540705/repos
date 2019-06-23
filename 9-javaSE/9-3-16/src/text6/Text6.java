package text6;
/*2.定义汽车类Car,包含以下成员：
	 成员属性:
			品牌 brand( String类型)
			电量 power(double类型)
     成员方法:
			报警 warning()   调用方法,可以检验当前电量是否低于10,如果低于10,就打印"电量不足". 如果不低于10,就打印"电量充足"

	1.按照以上要求定义Car,属性要私有,生成空参、有参构造，setter和getter方法
	2.定义测试类:根据如下需求创建多个对象,调用warning()方法.
		特斯拉-50    比亚迪-9*/
public class Text6 {
    public static void main(String[] args) {
        Car car1=new Car("特斯拉",50);
        Car car2=new Car("比亚迪",9);
        car1.waring();
        car2.waring();
    }
}
