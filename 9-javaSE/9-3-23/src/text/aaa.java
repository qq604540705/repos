package text;

public class aaa {
    public static void main(String[] args) {
        Animal an=new Animal();
        an.eat();
    }
}
class Animal{
    public final void eat(){
        System.out.println("吃饭");
    }
}
