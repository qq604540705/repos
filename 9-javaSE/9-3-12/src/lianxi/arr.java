package lianxi;
//创建一个动态数组,并赋值,数组1,3,5赋值1,3,5
public class arr {
    public static void main(String[] args) {
//        创建一个新的动态数组,并长度为5
        int[]arr=new int[5];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
//        赋值
        arr[0]=1;
        arr[2]=3;
        arr[4]=5;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

    }
}
