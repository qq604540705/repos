package demo;

public class InterfaceDemo1 {
    public static void main(String[] args) {
        Show show=new Show();
        show.eat();
        show.pi(Math.PI);
    }
}
interface inter1 {
    public static final int SUM = 999;
    public abstract void pi(double a);
}
interface inter2{
    public abstract void eat();
}
class Show implements inter1, inter2{
    @Override
    public void eat() {
        System.out.println("吃"+SUM+"感冒药");
    }
    @Override
    public void pi(double a) {
        System.out.println("π等于"+a);
    }
}