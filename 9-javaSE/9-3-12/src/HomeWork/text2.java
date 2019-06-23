package HomeWork;
/*第二题:
	1.定义一个包含十个元素的int类型的数组。数组元素自己给出
	2.定义一个方法,求出该数组的平均数,并返回
	3.在main方法中将该数组中大于平均数的元素打印到控制台上(平均数用2中定义的方法得到)*/
public class text2 {
    public static void main(String[] args) {
//        定义一个包含十个元素的数组
       int[]arr={10,20,50,35,6,3,18,1,21,22};
//       给包含求平均数方法赋值
       pingjun(arr);
        System.out.println("数组的平均数是"+pingjun(arr));
//        先把数组所有数打印,然后再做比较大小
        for (int a = 0; a < arr.length; a++) {
            if(arr[a]>pingjun(arr)){
                System.out.println("大于平均数的数为"+arr[a]);
            }
        }
    }
//    定义一个方法,求出该数组的平均数,并返回
    public static int pingjun(int arr[]){
        int sum=0;
        int pinjun=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
         return pinjun= sum/(arr.length+1);
    }
}
