package HomeWork;
/*第八题:
	1.打印1到100之内的整数，但数字中包含3的要跳过
	2.每行输出5个满足条件的数，之间用空格分隔
	3.如：1 2 4 5 6
		  7 8 9 10 11
		  ...*/
public class text8 {
    public static void main(String[] args) {
//        打印1-100之间的整数
        int huanhang=0;
        for(int a=1;a<101;a++ ){
//            数字中包含3的要跳开,先提取出所有数的个位和十位,再用选择语句筛选出包含3的数
            int ge=a%10;
            int shi=a/10%10;
            if(ge!=3&&shi!=3){
                System.out.print(a+" ");
 //            每行输出5个满足条件的数,之间用空格分隔,计数器思想,当计数达到5的时候,换行,先定义一个变量huanhang
                huanhang++;
                if(huanhang%5==0){
                    System.out.println();
                }
            }
        }
    }
}
