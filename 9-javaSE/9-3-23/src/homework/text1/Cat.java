package homework.text1;
/*4)创建Cat（猫）类，要求：
继承Animal类，实现speak接口,重写say方法，在方法内打印“yyy在喵喵喵~~~~” (ps: yyy代表狗的品种)*/
public class Cat extends Animal implements speak {
    @Override
    public void say() {
        System.out.println(getBreed()+"喵喵喵~~~~~~");
    }
}
