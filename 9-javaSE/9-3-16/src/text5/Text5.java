package text5;
/*1.定义“电脑类”Computer，包含以下成员：
         成员属性:
			品牌brand( String类型)
			价格 price(double类型)
         成员方法:
			编码coding(),  调用方法打印 ***电脑正在使用Java语言编程  ***代表品牌
			玩游戏,playGame()，调用方法打印 ***块钱的电脑正在玩王者荣耀s   ***代表价格

	1.按照以上要求定义Computer,属性要私有,生成空参、有参构造，setter和getter方法
	2.定义测试类,a.创建一个电脑对象，设置品牌为ThinkPad，价格为7399，调用方法coding
				 b.创建一个电脑对象，设置品牌为Acer，价格为5399,调用方法playGame*/
public class Text5 {
    public static void main(String[] args) {
        Computer thinkpad=new Computer();
        thinkpad.setBrand("ThinkPad");
        thinkpad.setPrice(7399);
        thinkpad.coding();
        System.out.println("-------------------");
        Computer acer=new Computer();
        acer.setBrand("Acer");
        acer.setPrice(5399);
        acer.playGame();
    }
}
