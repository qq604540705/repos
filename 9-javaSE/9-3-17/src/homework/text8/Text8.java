package homework.text8;

import java.util.Scanner;

/*第八题:
	1.模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果
		要求：
		(1)键盘录入三个整数,其中前两个整数代表参加运算的数据，
			第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
		(2)演示格式如下:
			请输入第一个整数:30
			请输入第二个整数:40
			请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0
			控制台输出:30+40=70*/
public class Text8 {
    public static void main(String[] args) {
        System.out.println("请输入第一个整数");
        Scanner sc1=new Scanner(System.in);
        int num1=sc1.nextInt();
        System.out.println("请输入第二个整数");
        int num2=sc1.nextInt();
        System.out.println("请输入一个整数(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)");
        int num3=sc1.nextInt();
        if(num3==0){
            System.out.println("结果为"+(num1+num2));
        }else if(num3==1){
            System.out.println("结果为"+(num1-num2));
        }else if(num3==2){
            System.out.println("结果为"+(num1*num2));
        }else if (num3==3){
            System.out.println("结果为"+(num1/num2));
        }else{
            System.out.println("输入有误");
        }
    }
}
