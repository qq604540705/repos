package demo;
/*
求所以的回文数,并统计回文数的个数
回文数:个位等于万位,十位等于千位
 */
public class For2 {
    public static void main(String[] args){
//        用for循环获取10000-99999所以的数
//       统计回文数出现的次数,用计数器思想,
        int sum=0;
        for(int a=10000;a<100000;a++ ){
//            获取一个数的个位,十位,千位,万位,
            int ge = a % 10;
            int shi = a/10%10;
            int qian=a/1000%10;
            int wan=a/10000%10;
            if(ge ==wan && shi==qian ){
                System.out.println(a);
//              计数器思想,每当结果为ture时,定义变量自增
                sum++;
            }
        }
        System.out.println("10000-99999中回文数出现的个位是"+sum);
    }
}
