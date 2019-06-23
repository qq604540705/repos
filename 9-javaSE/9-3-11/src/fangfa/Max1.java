package fangfa;
//用方法比较2个数的大小(double,和double)
public class Max1 {
    public static void main(String[] args) {
        max1(0.9999999999,0.999999999999);
        double v = max2(0.9999999999, 0.999999999999);
        System.out.println(v);
        System.out.println(max3());
    }
    public static void max1(double a ,double b){
        if (a>b){
            System.out.println("a更大");
        }else{
            System.out.println("b更大");
        }
    }
    public static double max2(double a,double b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static int max3(){
        int max3;
        int a=10;
        int b=10;
        return max3=a+b;
    }
}
