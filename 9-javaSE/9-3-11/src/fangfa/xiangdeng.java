package fangfa;
//比较2个数是否相等,
//参数列表分别为两个byte,两个short,两个Int类型,两个long类型
public class xiangdeng {
    public static void main(String[] args) {
        System.out.println(daxiao((byte)1,(byte)1));
        System.out.println(daxiao((short)1,(short)1));
        System.out.println(daxiao(1,1));
        System.out.println(daxiao(1L,1L));
    }
//    比较2个数是否相当,参数列表为2个byte
//    方法2要数:1.返回值类型boolean,2参数列表类型2个byte
    public static boolean daxiao(byte a ,byte b){
        return a==b;
    }
    public static boolean daxiao(short a ,short b){
        return a==b;
    }
    public static boolean daxiao(int a ,int  b){
        return a==b;
    }
    public static boolean daxiao(long a ,long b){
        return a==b;
    }
}
