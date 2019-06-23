package demo;

import java.util.Random;

public class Randome1 {
    public static void main(String[] args) {
        Random ra=new Random();
//        int sum= ra.nextInt(10);`
        for (int a = 0; a < 999; a++) {
            int sum= ra.nextInt(101);
            System.out.println("sum = " + sum);
            System.out.println("当前的随机数个数为"+a);
        }
    }
}
