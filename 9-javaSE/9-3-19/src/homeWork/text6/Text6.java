package homeWork.text6;

import java.util.Scanner;

/*第六题:
	1.创建一个集合,往集合中键盘录入5个字符串
	2.遍历集合,将集合中长度大于4的元素末尾加上一个X,
	3.遍历集合,将集合打印在控制台上.
	例:键盘录入后的集合{"123","ASDFQ","qq","poiuy","asd"}
	打印到控制台上的集合{"123","ASDFQX","qq","poiuyX","asd"}*/
public class Text6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入5个字符串");
        String st1=sc.nextLine();
        System.out.println("还剩4个字符串");
        String st2=sc.nextLine();
        System.out.println("还剩3个字符串");
        String st3=sc.nextLine();
        System.out.println("还剩2个字符串");
        String st4=sc.nextLine();
        System.out.println("还剩1个字符串");
        String st5=sc.nextLine();
        String []st={st1,st2,st3,st4,st5};
        for (int i = 0; i < st.length; i++) {
            if (st[i].length()>4){
                st[i]=st[i]+"X";
            }
        }
        for (int i = 0; i < st.length; i++) {
            System.out.print(st[i]+" ");
        }
    }
}
