package Demo;

import java.util.Scanner;

public class lianxi5 {
    public static void main(String[] args) {
        System.out.println("输入一串字符");
        Scanner st=new Scanner(System.in);
        String s = st.nextLine();//键盘录入一个字符串
        int a=0;//大写字母的个数
        int b=0;//小写字母的个数;
        int c=0;//数字字符的个数;
        int d=0;//其他字符的个数;
        char[]chars=s.toCharArray();//拆分成单个字符
        for (int x = 0; x < chars.length; x++) {
            char ch=chars[x];
            if('A'<=ch&&ch<='Z'){
                a++;
            }else if ('a'<=ch&&ch<'z'){
                b++;
            }else if('0'<=ch&&ch<'9'){
                c++;
            }else{
                d++;
            }
        }
        System.out.println("输入的大写字母的个数为"+a);
        System.out.println("输入的小写字母的个数为"+b);
        System.out.println("输入的数字支付的个数为"+c);
        System.out.println("输入的其他字符的个数为"+d);
    }
}

