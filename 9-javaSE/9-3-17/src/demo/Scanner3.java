package demo;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int sum1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int sum2 = sc.nextInt();
        System.out.println("请输入第三个数");
        int sum3 = sc.nextInt();
        System.out.println("最大的数是" + max(sum1, sum2, sum3));
    }

    public static int max(int sum1, int sum2, int sum3) {
        int max1 = sum1 > sum2 ? sum1 : sum2;
        int max2 = sum3 > max1 ? sum3 : max1;
        return max2;
    }
}
