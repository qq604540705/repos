package homework.text10;

import java.util.ArrayList;
import java.util.Scanner;

/*第十题:
	分析以下需求，并用代码实现
		1.创建一个储存整数的集合,键盘录入5个数据存入集合
		2.遍历集合,将集合中大于10的元素打印到控制台上,并求和.*/
public class Text10 {
    public static void main(String[] args) {
        ArrayList<Integer >arr=new ArrayList<>();
        System.out.println("请输入第一个整数");
        Scanner sc1=new Scanner(System.in);
        int num1=sc1.nextInt();
        System.out.println("请输入第二个整数");
        Scanner sc2=new Scanner(System.in);
        int num2=sc2.nextInt();
        System.out.println("请输入第三个整数");
        Scanner sc3=new Scanner(System.in);
        int num3=sc3.nextInt();
        System.out.println("请输入第四个整数");
        Scanner sc4=new Scanner(System.in);
        int num4=sc4.nextInt();
        System.out.println("请输入第五个整数");
        Scanner sc5=new Scanner(System.in);
        int num5=sc5.nextInt();
        arr.add(num1);
        arr.add(num2);
        arr.add(num3);
        arr.add(num4);
        arr.add(num5);
        System.out.print("集合中大于10的整数为: ");
        for (int a = 0; a < arr.size(); a++) {
            if(arr.get(a)>10){
                System.out.print(arr.get(a)+" ");
            }
        }
    }
}
