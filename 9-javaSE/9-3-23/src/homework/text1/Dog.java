package homework.text1;

/*3)创建Dog（狗）类，要求：
继承Animal类，实现speak接口,重写say方法，在方法内打印“xxx在汪汪汪~~~~”  (ps: xxx代表狗的品种)*/
public class Dog extends Animal implements speak {


    @Override
    public void say() {
        System.out.println(getBreed()+"在汪汪汪~~~~");
    }
}
