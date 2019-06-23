package HomeWork;
/*第五题:
	1.定义一个方法,能够判断传入的int类型数据是不是偶数,返回true或false
	2.借用1中定义的方法,判断1-100中那些数字是偶数,并打印出来,求和.*/
public class Text5 {
    public static void main(String[] args) {
//      传入的int类型数据是不是偶数,返回true或false
        System.out.println("当前输入的数是否为偶数"+oushu(3));
//      借用1中定义的方法,判断1-100中那些数字是偶数
//        先打印所有的数,
//       再用定义方法判断是否为偶数,
        int sum=0;
        int b=0;
        for(int a=1;a<101;a++){
              if(oushu(a)){
                  System.out.println(a);
                  sum+=a;
              }
//        求和所有偶数
        }
        System.out.println("所有偶数的和为"+sum);
    }
//    定义一个方法,能够判断传入的int类型数据是不是偶数,返回true或false
    public static boolean oushu(int a){
        boolean b=(a%2)==0;
        return  b;
    }
}