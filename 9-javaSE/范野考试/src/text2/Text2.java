package text2;
/*22、1. 定义书写功能接口(writeAction)

    a)    抽象方法void  write()

2. 定义笔类(Pen),实现writeAction接口,重写write()方法，方法内不需要编写内容；

    a)    属性: Price 价格（Float),color颜色(String 类型);

    b)    提供空参,满参构造方法和set/get方法;

3. 定义画笔类(Brush)  继承 Pen

a)    重写Pen中write()方法： 输出格式: “现在使用的是价格为XXX的YYY颜色的画笔”

PS：其中XXX为Brush的价格，YYY为Brush的颜色；

    b)    提供空参,满参构造方法

4. 定义铅笔类(Pencil)  继承 Pen

    a)     重写Pen中write()方法: 输出格式: “现在使用的是价格为XXX的YYY颜色的铅笔”

PS：XXX为Pencil的价格，YYY为Pencil的颜色；

   b)    提供空参,满参构造方法

5. 定义画家类（Painter)

    a)    属性: name姓名(String)

    b)    成员方法 : 绘画方法(void draw(Pen p)),首先输出“画家XX正在绘画，”，然后调用p对象的write方法，其中XX为Painter的姓名

    c)    提供空参,满参构造方法;set/get方法

6. 测试类Test

    a)    提供main方法

    b)    在main方法中

            i.    创建Brush类对象b1,价格赋值为5.8,颜色赋值为红色；

            ii.    创建Pencil类对象p1,价格赋值为2.5,颜色赋值为黑色；

            iii.    创建Painter对象,姓名赋值为王流秋；调用两次Painter的draw方法，分别传入b1和p1；进行测试；*/
public class Text2 {
//    a)    提供main方法
    public static void main(String[] args) {
        Brush b1=new Brush(5.8f,"红色");
        Pencil p1=new Pencil(2.5f,"黑色");
        Painter pa=new Painter("王流秋");
        pa.draw(b1);
        pa.draw(p1);
    }
}
