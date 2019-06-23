package lianxi;
//用除法和%的算法规则,求一个数的个,十,百....位数是什么
public class qiugewei {
    public static void main(String[] args){
        int a=6779;
        int ge,shi,bai,qian;
        ge=a%10;
        shi=a/10%10;
        bai=a/10/10%10;
        qian=a/10/10/10%10;
        System.out.println("a这个数的个位数是"+ge);
        System.out.println("a这个数的十位数是"+shi);
        System.out.println("a这个数的百位数是"+bai);
        System.out.println("a这个数的千位数是"+qian);
    }
}
