package fangfa;
//用打印方法的方式,输出1-100累加的和
public class Text5 {
    public static void main(String[] args) {
        System.out.println("1-100累加的结果为"+leijia());
    }
//    一个打印方法
    /*三要素:1.返回值类型
    *       2.方法名
    *       3.参数列表*/

    public static int leijia(){
        int sum=0;
        for(int a=1;a<=100;a++){
            sum+=a;
        }
        return sum;
    }

}
