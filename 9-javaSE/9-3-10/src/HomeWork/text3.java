package HomeWork;
/*第三题:
	1.打印1到100之内的整数，但数字中包含9的要跳过（十位包含9，个位包含9）
	2.如：1 2 3 4 5 ....*/
public class text3 {
    public static void main(String[] args) {
//首先打印100内的整数
    for(int a=1;a<101;a++){
//        跳过十位包含9,个位包含9的,用判断语句
        int ge=a%10;
        int shi=a/10%10;
        if(ge !=9&&shi !=9){
            System.out.println(a);
        }
    }
    }
}
