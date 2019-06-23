package homework.text5;
/*	1)构造方法: 空参构造、满参构造；
		2)成员变量:
					品牌 brand（String类型）
					价格price（int类型）
					续航mile（int类型）；
		3)成员方法:所有成员变量的set/get方法；*/
public class Ecar {
    private String brand;
    private int price;
    private int mile;

    public Ecar() {
    }

    public Ecar(String brand, int price, int mile) {
        this.brand = brand;
        this.price = price;
        this.mile = mile;
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

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }
}
