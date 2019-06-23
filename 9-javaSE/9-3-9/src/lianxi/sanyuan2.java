package lianxi;
//用三元运算符选出3个数中最大的值
public class sanyuan2 {
    public static void main(String[] args) {
        int a,b,c,max1,max2;
        a=150;
        b=200;
        c=300;
        max1=(a>b?a:b);
        max2=(max1>c?max1:c);
        System.out.println(max2);
    }
}
