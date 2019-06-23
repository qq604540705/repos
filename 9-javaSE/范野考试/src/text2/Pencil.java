package text2;
/*4. 定义铅笔类(Pencil)  继承 Pen

    a)     重写Pen中write()方法: 输出格式: “现在使用的是价格为XXX的YYY颜色的铅笔”

PS：XXX为Pencil的价格，YYY为Pencil的颜色；*/
public class Pencil extends Pen {
    @Override
    public void write() {
        System.out.println("现在使用的是价格为"+getPrice()+"的"+getColor()+"颜色的铅笔");
    }

    public Pencil() {
    }

    public Pencil(Float price, String color) {
        super(price, color);
    }
}
