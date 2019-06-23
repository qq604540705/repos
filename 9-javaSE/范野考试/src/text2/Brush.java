package text2;
/*3. 定义画笔类(Brush)  继承 Pen

a)    重写Pen中write()方法： 输出格式: “现在使用的是价格为XXX的YYY颜色的画笔”

PS：其中XXX为Brush的价格，YYY为Brush的颜色；

    b)    提供空参,满参构造方法*/
public class Brush extends Pen {
    @Override
    public void write() {
        System.out.println("现在使用的是价格为"+getPrice()+"的"+getColor()+"颜色的画笔");
    }

    public Brush() {
    }

    public Brush(Float price, String color) {
        super(price, color);
    }
}
