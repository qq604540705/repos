package text1;
/*	手机类Phone
	属性:
		品牌brand
		价格price
	行为:
		打电话call()
		发短信sendMessage()
		玩游戏playGame()*/
public class phone {
    private String brand;
    private int price;
//属性要私有,生成空参、有参构造，setter和getter方法
    public phone() {
    }

    public phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void call(){
        System.out.println("正在使用价格为"+price+"的手机打电话");
    }
    public void sendMEessage(){
        System.out.println("正在使用"+price+"品牌的手机发短信");
    }
    public void playGame(){
        System.out.println("正在使用价格为"+price+"元的"+brand+"品牌的手机玩游戏");
    }
}
