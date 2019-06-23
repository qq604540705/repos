package HomeWork;
/*第一题:
	1.定义一个包含十个元素的int类型的数组。数组元素自己给出
	2.遍历打印出数组元素
	3.求出数组当中的最小值打印出来
	4.求出数组当中的最大值打印出来*/
public class text1 {
    public static void main(String[] args) {
//        定义一个包含十个元素的int类型的数组
        int arr[]={100,20,30,40,5,60,70,80,90,100};
        int min=arr[0];
        int max=arr[0];
        for (int a = 0; a < arr.length; a++) {
//            遍历打印出数组元素
            System.out.println(arr[a]);
//          求出数组当中的最小值
                if(arr[a]<min){
                    min=arr[a];
                }
//          求出数组当中的最大值
                if(arr[a]>max){
                    max=arr[a];
                }
        }
        System.out.println("数组的最小值为 " + min);
        System.out.println("数组的最大值为 " + max);
    }
}
