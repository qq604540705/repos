package homeWork.text2;

public interface Phone {
    //    1.抽象方法: playGame()
    abstract void playGame();
    //    2.默认方法: sendMessage(),输出"发短信"
    default void sendMessage(){
        System.out.println("发短信");
    }
    //    3.静态方法: call(),输出"打电话"
    public static void call(){
        System.out.println("打电话");
    }
}
