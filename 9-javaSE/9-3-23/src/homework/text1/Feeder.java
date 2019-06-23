package homework.text1;
/*5)定义Feeder(铲屎官)类,要求:
      成员属性：姓名（name），String类型。
      成员方法: 喂养void feed(Animal a) , 在方法内调用a的say方法打印输出*/
public class Feeder {
    String name;

    public void feed(Animal a){
        if(a instanceof Cat){
            Cat c=(Cat)a;
            c.say();
        }
        if (a instanceof Dog){
            Dog d=(Dog)a;
            d.say();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
