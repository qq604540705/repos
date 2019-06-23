package homework.text1;

/*21【代码题】 编号:SJ020200本题分数:20分  *难度：
按照要求完成以下内容：
1)创建Animal（动物）抽象类，包含：
   成员属性：品种（breed），String类型。
   
2)创建speak（说话）接口，包含：
有参无返回值的抽象方法：void say()。

3)创建Dog（狗）类，要求：
继承Animal类，实现speak接口,重写say方法，在方法内打印“xxx在汪汪汪~~~~”  (ps: xxx代表狗的品种)

4)创建Cat（猫）类，要求：
继承Animal类，实现speak接口,重写say方法，在方法内打印“yyy在喵喵喵~~~~” (ps: yyy代表狗的品种)


5)定义Feeder(铲屎官)类,要求:
      成员属性：姓名（name），String类型。
      成员方法: 喂养void feed(Animal a) , 在方法内调用a的say方法打印输出

6)创建测试类，在测试类的main方法中完成：
      创建Dog对象并赋值”田园犬”; 创建Cat对象并赋值”波斯猫”
      创建Feeder对象赋值”布鲁斯”,并调用两次feed方法分别传入dog和cat对象,完成测试*/
public class text1 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setBreed("田园犬");
        Cat cat=new Cat();
        cat.setBreed("波斯猫");
        Feeder fee=new Feeder();
        fee.setName("布鲁斯");
        fee.feed(dog);
        fee.feed(cat);
    }
}
