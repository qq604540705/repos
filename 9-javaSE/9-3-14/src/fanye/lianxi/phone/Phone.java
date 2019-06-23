package fanye.lianxi.phone;

public class Phone {
    //    定义三个成员变量
    public String xinghao = "iphone Xmax";
    public int price = 13888;
    public String color = "星空黑";

    //    定义2个成员方法
    public void call(String a) {
        System.out.println("给" + a + "打电话");
    }

    public void takeOut() {
        System.out.println("手机遗失了");
    }
}

