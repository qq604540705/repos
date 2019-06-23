package lianxi;
//如果数组A的地址赋给数组B,然后修改了数组B,数组A的数据会变吗
public class shuzu {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        int[] b = a;
        b[0]=100;
        b[1]=200;
        System.out.println(a[0]);
    }
}

