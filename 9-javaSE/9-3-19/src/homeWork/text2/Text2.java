package homeWork.text2;

import java.util.Scanner;

/*第二题:
	1.键盘录入一个字符串
	2.统计录入的字符串中的大写字母,小写字母,数字分别有多少个.*/
public class Text2 {
    public static void main(String[] args) {
        System.out.println("请输入一串字符串");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] st1 = st.toCharArray();
        int a = 0;//大字字母
        int b = 0;//小写字母
        int c = 0;//数字
        for (int i = 0; i < st1.length; i++) {
            char x=st1[i];
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

