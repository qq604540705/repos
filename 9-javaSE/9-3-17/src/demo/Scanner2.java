package demo;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        Double num1=sc.nextDouble();
        System.out.println("请输入第二个数");
        Double num2=sc.nextDouble();
        Double max=num1+num2;
        System.out.println("max = " + max);
    }
}
