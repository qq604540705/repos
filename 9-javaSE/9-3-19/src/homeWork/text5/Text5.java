package homeWork.text5;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Random;
import java.util.Scanner;

/*第五题:
	1.键盘录入一个字符串
	2.从字符串中随机获取3次字符,将获取的3个字符组成一个新的字符串.打印到控制台上*/
public class Text5 {
    public static void main(String[] args) {
        System.out.println("输入一个字符串,将随机抽取3个字符");
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        Random r=new Random();
        int a=r.nextInt(st.length());
        int b=r.nextInt(st.length());
        int c=r.nextInt(st.length());
        char[] char1=st.toCharArray();
        String st2="";
        st2=st2.concat(char1[a]+"");
        st2=st2.concat(char1[b]+"");
        st2=st2.concat(char1[c]+"");
        System.out.println(st2);
    }
}
