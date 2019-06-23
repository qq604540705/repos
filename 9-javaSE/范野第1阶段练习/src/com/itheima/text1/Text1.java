package com.itheima.text1;
/*第一题:
	在main方法中定义3个变量：int a = 50;  int b = 30;  int c = 80;
	并依次完成以下要求：
	1.定义方法getMax()利用if语句求出a、b、c中最大的数并打印到控制台上；
	2.定义方法getMin()利用三元运算符求出a、b、c中最小的数并打印到控制台上；*/
public class Text1 {
//    在main方法中定义3个变量：int a = 50;  int b = 30;  int c = 80;
    public static void main(String[] args) {
    int a=50;
    int b=30;
    int c=80;
//    用方法getMax()来求最大值
        System.out.println("3个数中最大的数是"+geMax(a,b,c));
//    用方法getMin()来求最小值
        System.out.println("3个数中最小值是"+getMin(a,b,c));

    }
//    1.定义方法getMax()利用if语句求出a、b、c中最大的数并打印到控制台上；
    public static int geMax(int a,int b,int c){
        int max=0;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if (c>max){
            max=c;
        }else {
            max=max;
        }
        return max;
    }
//    2.定义方法getMin()利用三元运算符求出a、b、c中最小的数并打印到控制台上
    public  static int getMin(int a,int b,int c){
        int min=(a<b?a:b);
        int min2=(c<min?c:min);
        return min2;
    }
}
