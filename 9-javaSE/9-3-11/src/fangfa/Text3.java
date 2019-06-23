package fangfa;
//用方法实现2个数比较大小
public class Text3 {
//    定义一个主方法
    public static void main(String[] args) {
    max(10,20);
    }
/* 定义一个主方法,boolean类型,方法的三要素1.返回值类型 2.方法名称 3.参数列表
    1.返回值类型 boolean, 2.方法名称 max 3.参数列表int a,b
*/
    public static boolean max(int a,int b){
        if (a>b){
            System.out.println("数字a更大");
        }else{
            System.out.println("数字b更大");
        }
        return a>b;
    }
}
