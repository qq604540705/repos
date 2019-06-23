package HomeWork;
/*要求:
		1.定义方法 isSXH(int num)
			功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false
		2.在主方法中借助1中定义的方法,2个一行,打印所有的水仙花数及水仙花数的总个数*/
public class Text3 {
    public static void main(String[] args) {
        System.out.println("输入的数是否为水仙花数:"+isSXH(999));
    }
//    定义方法 isSXH(int num)
    public static boolean isSXH(int num){
        boolean a;
        int ge=num%10;
        int shi=num/10%10;
        int bai=num/10/10%10;
        return a=((ge*ge*ge)+(shi*shi*shi)+(bai*bai*bai)==num);
    }
}
