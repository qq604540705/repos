package com.itheima.text3;
/*第三题:
定义五个方法getMax,  getMin,  getSum,  getAvg,  getCount分别求数组的最大值 ,最小值, 总和, 平均值与奇数的个数;
在主方法中定义数组{23,55,32,18,67,75,97,12,78,89}, 调用每个方法,将数组作为参数, 获取最终的结果, 在控制台输出*/
public class Text3 {
    public static void main(String[] args) {
        int[] arr={23,55,32,18,67,75,97,12,78,89};
//        1.最大值
        getMax(arr);
//        2.最小值
        getMin(arr);
//        3.总和
        getSum(arr);
//        4.平均数;
        getAvg(arr);
//        5.求奇数的个数;
        getCount(arr);
    }
//    1.定义方法getMax求最大值
    public static void getMax( int arr[]){
        int max=arr[0];
        for (int a = 0; a < arr.length; a++) {
            if (arr[a]>max){
                max=arr[a];
            }
        }
        System.out.println("数组的最大值为"+max);
    }
//    2.定义方法getMin求最小值
    public static void getMin(int arr[]){
        int min=arr[0];
        for (int a = 0; a < arr.length; a++) {
            if(arr[a]<min){
                min=arr[a];
            }
        }
        System.out.println("数组的最小值为"+min);
    }

//    3.定义方法getSum求总和
    public static void getSum( int arr[]){
        int sum=0;
        for (int a = 0; a < arr.length; a++) {
            sum+=arr[a];
        }
        System.out.println("数组的总和为"+sum);
    }
//    4.定义方法getAvg求平均值
    public static void getAvg( int arr[]){
        int avg=0;
        int sum=0;
        for (int a = 0; a < arr.length; a++) {
            sum+=arr[a];
        }
        avg=sum/arr.length;
        System.out.println("数组的平均数是"+avg);
    }
//    5.定义方法getCount求奇数的个数
    public static void getCount(int arr[]){
        int geshu=0;
        for (int a = 0; a < arr.length; a++) {
            if(arr[a]%2!=0) {
                geshu++;
            }
        }
        System.out.println("数组中奇数的个数是"+geshu);
    }
}
