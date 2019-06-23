package com.itheima.text5;
/*第五题:
1.定义一个方法union()，传入两个数组，方法的功能是将两个数组的元素合并到一个新数组中, 并返回这个新数组
		public static int[] union(int[] arr1, int[] arr2){
功能: 将两个数组的元素存入到一个新数组中并返回
}

2.在主方法中定义两个数组并赋值,调用union方法传入这两个数组完成数组合并, 将新数组的内容打印到控制台上
举例:
数组1中元素:{78, 48, 94, 34}
数组2中元素:{20, 32, 10, 98, 69, 52}
			合并后数组：{78, 48, 94, 34, 20, 32, 10, 98, 69, 52}*/
public class Text5 {
    public static void main(String[] args) {
        int[] arr1={78,48,94,34};
        int[] arr2={20,32,10,98,69,52};
        for (int a = 0; a < union(arr1, arr2).length; a++) {
            System.out.print(union(arr1,arr2)[a]+" ");
        }
    }
//    定义一个方法合并2个数组
    public static int[] union(int arr1[],int arr2[]){
        int[] arr3=new int[arr1.length+arr2.length];
        for (int a = 0; a < arr1.length; a++) {
            arr3[a]=arr1[a];
        }
        for (int a = 0; a < arr2.length; a++) {
            arr3[a+arr1.length]=arr2[a];
        }
        return arr3;
    }
}
