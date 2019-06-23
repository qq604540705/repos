package homeWork.text4;

import java.util.Scanner;

/*第四题:
	1.键盘录入一个字符串
	2.将该字符串变成字符数组
	3.将字符数组中的所有大写字母变成小写字母
	4.如果第一位和最后一位的内容不相同,则交换
	5.将字符数组中索引为偶数的元素变成'~'
	6.打印数组元素的内容
	------------------------------
	【结果展示】
			请输入字符串
				abcDEf719
			最终显示的效果
				~b~d~f~1~
				*/
public class Text4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String st=sc.nextLine();
        char ch[]=st.toCharArray();
         if(ch[0]!=ch[ch.length-1]){
             char a=ch[0];
           ch[0]=ch[ch.length-1];
           ch[ch.length-1]=a;
        }
        for (int i =0; i < ch.length; i++) {
            if('A'<=ch[i]&&ch[i]<='Z'){
                ch[i]=(char)(ch[i]+32);
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if(i%2==0){
                ch[i]='~';
            }
        }
        for (int i1 = 0; i1 < ch.length; i1++) {
            System.out.print(ch[i1]);
        }
    }
}
