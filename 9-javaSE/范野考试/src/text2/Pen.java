package text2;
/*2. 定义笔类(Pen),实现writeAction接口,重写write()方法，方法内不需要编写内容；

    a)    属性: Price 价格（Float),color颜色(String 类型);

    b)    提供空参,满参构造方法和set/get方法;*/
public class Pen implements Shuxie {
    @Override
    public void write() {

    }
    Float Price;//价格
    String color;//颜色

    public Pen() {
    }

    public Pen(Float price, String color) {
        Price = price;
        this.color = color;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
