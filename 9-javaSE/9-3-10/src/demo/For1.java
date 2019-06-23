package demo;
//用for循环语句,求1-100的奇数合
public class For1 {
    public static void main(String[] args) {
        int sum=0;
//        for(初始化值,判断条件,控制条件语句){
//              循环语句体}
        for(int a=0;a<100;a++){
//          首先获取1-100中的奇数,用If语句判断,在循环中自增的变量是否为奇数
            if(a%2 !=0){
                sum=sum+a;
            }
        }
        System.out.println(sum);
    }
}
