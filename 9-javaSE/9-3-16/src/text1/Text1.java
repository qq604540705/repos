package text1;
/*第一题：分析以下需求，并用代码实现
	手机类Phone
	属性:
		品牌brand
		价格price
	行为:
		打电话call()
		发短信sendMessage()
		玩游戏playGame()

	要求:
		1.按照以上要求定义类,属性要私有,生成空参、有参构造，setter和getter方法
		2.定义测试类,在main方法中创建该类的对象并使用set方式给属性赋值(价格:998,品牌:小米)
		3.调用三个成员方法,打印格式如下:
			正在使用价格为998元的手机打电话....
			正在使用小米品牌的手机发短信....
			正在使用价格为998元的小米品牌的手机玩游戏....*/
public class Text1 {
    public static void main(String[] args) {
        phone text=new phone();
        text.setBrand("小米");
        text.setPrice(998);
        text.call();
        text.sendMEessage();
        text.playGame();
    }
}
