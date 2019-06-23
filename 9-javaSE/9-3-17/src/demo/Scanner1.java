package demo;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
//        创建Scanner对象,在创建对象时会自动调方法
        Scanner sc=new Scanner(System.in);
//        键盘录入
        System.out.println("请输入一个整数");
        int num=sc.nextInt();
        System.out.println("num = " + num);
    }
}
