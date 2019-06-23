package HomeWork;
/*第一题:
	分析以下需求，并用代码实现(每个小需求都需要封装成方法)
	1.求两个数据之和(整数 小数),在main方法中打印出来
	2.判断两个数据是否相等(整数 小数),在控制台上打印出来
	3.获取两个数中较大的值(整数 小数),在控制台上打印出来
	4.获取两个数中较小的值(整数 整数),在main方法中打印出来*/
public class Text1 {
    public static void main(String[] args) {
//        打印2个数的和
        System.out.println("2个数的和为"+sum(1,0.001));
//      判断两个数据是否相等
        System.out.println("2个数是否相等的判断结果是"+deng(1,0.0001));
//       获取两个数中较大的值
        max(5,3.3);
//       获取两个数中较小的值
        min(5,9.9999);
    }
//    求两个数据之和(整数 小数),在main方法中打印出来
    public static double sum (double a ,double b){
        double sum;
        return sum=a+b;
    }
//    判断两个数据是否相等(整数 小数),在控制台上打印出来
    public static boolean deng(double a,double b){
        boolean c= a==b;
        return  c;
    }
//    获取两个数中较大的值(整数 小数),在控制台上打印出来
    public static void max(double a,double b){
        int max;
        if(a>b){
            System.out.println("较大的数为a");
        }else{
            System.out.println("较大的数为b");
        }
    }
//    获取两个数中较小的值(整数 整数),在main方法中打印出来
    public static void min(double a,double b){
    int max;
    if(a>b){
        System.out.println("较小的数为b");
    }else{
        System.out.println("较小的数为a");
    }
}
}
