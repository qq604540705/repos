package HomeWork;
/*第七题:
	求出三位数中所有的水仙花数,并将他们打印到控制台上.求出所有水仙花数的和,并统计共有多少个水仙花数.
	水仙花数是 个位十位百位的立方和等于这个数本身*/
public class text7 {
    public static void main(String[] args) {
//打印出100-999中所以的数
        int cishu=0;
        for(int a=100;a<1001;a++ ){
//            提取出所有数的个位,十位,百位
            int ge = a % 10;
            int shi = a/10 %10;
            int bai = a/100 %10;
//           判断个位,十位,百位的立方是否等于这个数本身,用判断结构
            if((ge*ge*ge+shi*shi*shi+bai*bai*bai) ==a ){
                System.out.println(a);
                cishu++;
            }
//            统计有多少次数,用计数器思想
        }
        System.out.println("水仙花数出现的次数为"+cishu);
    }
}
