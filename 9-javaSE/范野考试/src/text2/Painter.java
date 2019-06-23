package text2;
/*5. 定义画家类（Painter)

    a)    属性: name姓名(String)

    b)    成员方法 : 绘画方法(void draw(Pen p)),首先输出“画家XX正在绘画，”，然后调用p对象的write方法，其中XX为Painter的姓名

    c)    提供空参,满参构造方法;set/get方法*/
public class Painter {
    String name;
    public void draw(Pen p){
        System.out.println("画家"+name+"正在绘画");
        p.write();
    }

    public Painter() {
    }

    public Painter(String name) {
        this.name = name;
    }
}
