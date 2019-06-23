package HomeWork;
/*第五题:
	分析以下需求，并用while循环将代码实现：
	1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
	2.请问，折叠多少次，可以折成珠穆朗玛峰的高度。
初始化表达式①
        while(布尔表达式②){
        循环体③
        步进表达式④
        }*/
public class text5 {
    public static void main(String[] args){
//计数器思想,添加一个计数器变量,通过嵌套到循环语句里面,就可以知道循环了多少次
        int b=0;
        double a=0.0001;
        while(a<8848){
            b++;
            a*=2;
        }
        System.out.println("需要折叠"+b);
    }
}
