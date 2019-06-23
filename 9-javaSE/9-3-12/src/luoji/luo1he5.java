package luoji;
/*写案例练习这些逻辑
1.取余判断奇数和偶数：
案例：找出1===》100之间的奇数和偶数
2交换两个变量的值。掌握两种：加减法交换，定义三方变量交换
案例：char a=’f’ char b=’e’   交换这两个变量的值
      int a=10  int b=15;	  交换着两个变量的值
3.累加器的思想：
案例：记录1===》100之间一共有多少个带5的数字
4.求和思想：
案例：求1===》100之间奇数和   偶数和  总和
5.求最值思想：
案例：求两个数的最大值，求三个数的最大值。
求数组里面int []arr={12,15,2,3,9,8,55,67,89};最大的值。
6.数组倒序思想：
案例：int []arr={12,15,2,3,9,8,55,67,89};对该数组进行倒序
7.以漂亮的方式打印数组:[1,  2,  3,  4,  5]
8.把逻辑封装进方法：
案例：把以上的案例全部用方法来实现*/
public class luo1he5 {
    public static void main(String[] args) {
//1.取余判断奇数和偶数
        jiou(1,100);
//2.交换两个变量的值
        jiaohuan('f','e');
//3.累加器的思想
        System.out.println(leijiaqi(1,100));
    }


 /* 1.取余判断奇数和偶数
    案例：找出1===》100之间的奇数和偶数*/
    public static void jiou(int a,int b) {
        for (int x = a; x <= b; x++) {
            if(x%2==0){
                System.out.println(a+"到"+b+"之间的偶数为"+x);
            }else{
                System.out.println(a+"到"+b+"之间的奇数为"+x);
            }
        }
    }
/*2交换两个变量的值。掌握两种：加减法交换，定义三方变量交换
案例：char a=’f’ char b=’e’   交换这两个变量的值
      int a=10  int b=15;	  交换着两个变量的值*/
    public static void jiaohuan(char a,char b){
    char x=a;
         a=b;
         b=x;
        System.out.println(a);
        System.out.println(b);
    }
/*3.累加器的思想：
案例：记录1===》100之间一共有多少个带5的数字*/
    public static int leijiaqi(int a,int b){
        int leijiaqi=0;
        for (int x = a; x < a; x++) {
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            if(ge%5==0|shi%5==0|bai%5==0){
                leijiaqi++;
            }
        }
        return leijiaqi;
    }
}
