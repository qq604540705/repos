package fangfa;
//用方法实现1-100的数累加和
public class Text4 {
    public static void main(String[] args) {
        System.out.println("求和的结果是"+sum(1,100));
    }
//    定义一个累加的方法
    public static int sum(int chushi,int cishu ){
        int max=0;
        for (int a=chushi;a<=cishu;a++){
            max+=a;
        }
        return max;
    }
}
