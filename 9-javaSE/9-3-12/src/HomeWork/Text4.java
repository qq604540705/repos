package HomeWork;
/*第四题:
	1.定义一个包含十个元素的int类型的数组。数组元素自己给出
	2.统计该数组中有多少个大于平均值的元素,在控制台上打印出来.并求和.*/
public class Text4 {
    public static void main(String[] args) {
//        定义一个包含十个元素的int类型的数组。
        int sum1=0;
        int sum2=0;

        int[]arr={2,7,8,4,1,5,6,7,8,12};
        for (int a = 0; a < arr.length; a++) {
            sum1+=arr[a];
        }
        int pingjun=sum1/arr.length+1;
        for (int a = 0; a < arr.length; a++) {
            if(arr[a]>pingjun){
                System.out.println("大于平均值的元素为"+arr[a]);
                sum2+=arr[a];
            }
        }
        System.out.println("大于平均值的元素的和为"+sum2);
    }
}
