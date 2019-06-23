package homework;
/*
 1.定义两个int类型变量a,b. 求出两个变量的最大值,并打印出来
	2.定义三个int类型变量c,d,e. 求出三个变量的最大值,并打印出来*/
public class text8 {
    public static void main(String[] args) {
        int a,b;
        a=50;
        b=70;
        int max=a>b?a:b;
        System.out.println(max);
        {
            int c,d,e;
            c=5;
            d=15;
            e=10;
            int max1=c>d?c:d;
            int max2=max1>e?max1:e;
            System.out.println(max2);
        }
    }
}
