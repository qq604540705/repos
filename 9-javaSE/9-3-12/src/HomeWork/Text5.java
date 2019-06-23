package HomeWork;
/*第五题:
	1.现存在如下两个数组:
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
	2.要求定义一个方法,	3.在main方法中调用该方法,将返回的数组遍历打印
将上面两个数组传入,在方法中将两个数组合并,形成一个新的数组,并返回.
		新的数组: arr3 = {1,2,3,4,5,6}*/
public class Text5 {
    public static void main(String[] args) {
//        定义2个数组
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] hebing = hebing(arr1, arr2);
        for (int a = 0; a < hebing.length; a++) {
            System.out.println(hebing[a]);
        }

    }
//    定义一个方法,让2个数组合并成一个数组
    public static int[] hebing(int arr1[],int arr2[]){
//        定义一个新数组去装2个数组
        int[] hebing =new int[arr1.length+arr2.length];
        for (int a = 0; a < hebing.length; a++) {
            if(a<(arr1.length)){
                hebing[a]=arr1[a];
            } else{
                int num =a-arr1.length;
                hebing[num + arr1.length]=arr2[num];
            }
        }
        return hebing;
    }
}
