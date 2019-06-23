package homeWork.text2;
/*定义IPhone类实现Phone接口,实现抽象方法playGame(),输出"打王者农药,吃鸡"
								  重写默认方法sendMessage(),输出"发彩信"*/
public class Iphone implements Phone {
    @Override
    public void playGame() {
        System.out.println("打王者荣耀,吃鸡");
    }

    @Override
    public void sendMessage() {
        System.out.println("发短信");
        Phone.call();
    }
}
