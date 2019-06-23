package homeWork.text8;
/*第八题:
	完成下列题目要求：
		①定义方法filter
			要求如下：
				参数：String[] arr，String  str
				返回值类型：String[]
			实现：遍历arr，将数组中包含参数str的元素存入另一个String 数组中并返回
			PS：返回的数组长度需要用代码获取
		②在main方法中完成以下要求：
			定义一个String数组arr，数组元素有："itcast","itheima","baitdu","weixin","zhifubao"
			调用1中的filter方法传入arr数组和字符串”it”，输出返回的String数组中所有元素
		示例如下：
			输出的数组中的元素:
			"itcast","itheima","baitdu"*/
public class Text8 {
    public static void main(String[] args) {
        String[] st={"itcast","itheima","baitdu","weixin","zhifubao"};
        String[] st2=filter(st,"it");
        for (int a = 0; a < st2.length; a++) {
            System.out.print(st2[a]+" ");
        }
    }
    public static String []filter(String[]arr,String str){
        int b=0;
        for (int a = 0; a < arr.length; a++) {
            if(arr[a].contains(str)){
                b++;
            }
        }
        String []st=new String[b];
        int c=0;
        for (int a = 0; a < arr.length; a++) {
            if(arr[a].contains(str)){
                st[c]=arr[a];
                c++;
            }
        }
        return st;
    }
}
