package homework.text7;

import java.util.Scanner;

/*第七题:
	1.定义方法 isSXH(int num)
		功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false
	2.在主方法中,键盘录入数据,调用isSXH方法,判断传入的数据是否为水仙花数,如果是就输出"xxx为水仙花数",否则就输出"xxx不是水仙花数"
		演示:
			  请输入一个三位整数:
			  100
			  100不是水仙花数*/
public class Text7 {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isSXH(num);
    }
    public static void isSXH(int a){
        int ge=a%10;
        int shi=a/10%10;
        int bai=a/10/10%10;
        if((ge*ge*ge)+(shi*shi*shi)+(bai*bai*bai)==a){
            System.out.println(a+"这个数是水仙花数");
        }else{
            System.out.println(a+"这个数不是水仙花数");
        }
    }
}
