package homework;
/*1.定义一个三位整数，请分别获取该三位数上每一位的数值
	2.例如：定义的整数123的个位、十位、百位，分别是3、2、1
	3.打印格式:"数字123的个位是 3, 十位是 2, 百位是 1"
* */
public class text6 {
    public static void main (String[] args){
        int a =123;
        System.out.println("数字123的个位数是"+(a%10));
        System.out.println("数字123的十位数是"+(a/10%10));
        System.out.println("数字123的百位位数是"+(a/10/10%10));
    }
}
