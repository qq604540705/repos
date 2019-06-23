package lianxi;
/* ++,变量和变量一起运算时,变量前用和变量后用效果不一样
变量前使用,++a,先加1然后再赋值,a++先赋值再加1
* */
public class jiajia {
    public static void main(String[] args) {
        {
            int a = 1, b = 0;
            b = ++a;
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println("==============");
        {
            int a=1,b=0;
            b =a++;
            System.out.println(a);
            System.out.println(b);
        }
        {
            int a=1,b=0;
            b=a+1;
            System.out.println(b);
        }
    }
}
