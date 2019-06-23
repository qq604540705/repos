package text5;

public class Computer {
    private String brand;
    private double price;

    public Computer() {
    }

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void coding(){
        System.out.println(brand+"电脑正在使用Java语言编程");
    }
    public void playGame(){
        System.out.println(price+"块钱的电脑正在玩王者荣耀");
    }
}
