package homeWork.text3;

import java.util.Scanner;

/*第三题:
	1.键盘录入5个字符串,组成一个数组
	2.统计录入的字符串数组中的大写字母,小写字母,数字分别有多少个.*/
public class Text3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串1");
        String st1 = sc.nextLine();
        System.out.println("请输入字符串2");
        String st2 = sc.nextLine();
        System.out.println("请输入字符串3");
        String st3 = sc.nextLine();
        System.out.println("请输入字符串4");
        String st4 = sc.nextLine();
        System.out.println("请输入字符串5");
        String st5 = sc.nextLine();
        String[] ch = {st1, st2, st3, st4, st5};
        int a = 0;//大写字母
        int b = 0;//小写字母
        int c = 0;//数字
        String str = "";
        for (int i = 0; i < ch.length; i++) {
            str=str.concat(ch[i]);
        }
        char[] cha = str.toCharArray();
        for (int i = 0; i < cha.length; i++) {
            char x = cha[i];
            if ('A' <= x && x <= 'Z') {
                a++;
            } else if ('a' <= x && x <= 'z') {
                b++;
            } else if ('0' <= x && x <= '9') {
                c++;
            }
        }
        System.out.println("输入字符串中大写字母有" + a);
        System.out.println("输入字符串中小写字母有" + b);
        System.out.println("输入字符串中数字有" + c);
    }
}