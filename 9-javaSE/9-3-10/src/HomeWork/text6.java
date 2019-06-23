package HomeWork;
/*第六题:
	求出1-100之间，奇数的个数和所有奇数之和。并在控制台上进行打印*/
public class text6 {
    public static void main(String[] args) {
//        先打印出1-100到所有的数
        int sum=0;
        for(int a =1;a<101;a++){
//            筛选出所有的奇数
            if(a%2==1){
//                新建一个变量sum,将奇数求和
                sum +=a;
            }
        }
        System.out.println(sum);
    }
}
