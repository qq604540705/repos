package demo;

import java.util.Random;
import java.util.Scanner;

public class Randome2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个数可以获得输入数的随机数");
        int x=sc.nextInt();
        print(x);
    }
    public static void print(int a){
        Random ra=new Random();
        for (int b = 0; b < 10; b++) {
            int x=ra.nextInt(a);
            System.out.println("x = " + x);
        }
    }
}
