package com.itheima.text4;
/*第四题:
定义一个方法printNum, 打印1-500(包含1和500)能同时被2，5，7整除的所有数, 并统计满足条件的个数, 在主方法中调用此方法完成测试.*/
public class Text4 {
    public static void main(String[] args) {
        printNum(1,500);
    }
    /*定义一个方法printNum, 打印1-500(包含1和500)能同时被2，5，7整除的所有数,
    并统计满足条件的个数, 在主方法中调用此方法完成测试*/
    public static void printNum(int a,int b){
        int geshu=0;
        for (int x = a; x <=b; x++) {
            if (x%2==0&&x%5==0&&x%7==0){
                System.out.println(a+"到"+b+"之间能被2,5,7同时整除的数为"+x);
                geshu++;
            }
        }
        System.out.println(a+"到"+b+"之间能同时被2,5,7,整除的个数有"+geshu);
    }
}
