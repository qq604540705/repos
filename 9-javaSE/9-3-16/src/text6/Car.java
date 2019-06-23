package text6;

public class Car {
    private String brand;
    private double power;

    public Car() {
    }

    public Car(String brand, double power) {
        this.brand = brand;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
    public void waring(){
        if(power<10){
            System.out.println("电量不足");
        }else {
            System.out.println("电量充足");
        }
    }
}
