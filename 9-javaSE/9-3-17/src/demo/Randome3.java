package demo;

import java.util.Random;
import java.util.Scanner;

public class Randome3 {
    public static void main(String[] args) {
//        拿到一个1-100以内的随机数
        Random ra=new Random();
        int guessNum=ra.nextInt(99)+1;
//        键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个1-100的数比较大小");
        System.out.println("剩余次数为"+(5));
//        定义一个只有5次的循环
        for (int a = 0; a < 5; a++) {
//            获取键盘录入数字大小
            int x=sc.nextInt();
            if (x>guessNum){
                System.out.println("您输入的数字大了");
                System.out.println("您的剩余次数为"+(4-a));
            }else if(x==guessNum){
                System.out.println("恭喜您猜对了");
            }else if(x<guessNum){
                System.out.println("您输入的数字小了");
                System.out.println("您的剩余次数为"+(4-a));
            }
        }
        System.out.println("游戏结束");
    }
}
