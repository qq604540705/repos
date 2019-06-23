package homework.text9;

import java.util.Random;

/*第九题:
	分析以下需求，并用代码实现
		1.创建两个长度为5的数组，数组内元素为随机生成的 1-100之间的偶数。(r.nextInt(50)+1)*2
		2.定义一个方法hebin(描述如下)，传入两个数组，方法中将两个数组元素合并到一个新数组中，并且将新数组的内容打印到控制台上*/
public class Text9 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Random r=new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=r.nextInt(100)+1;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=r.nextInt(100)+1;
        }
        hebin(arr1,arr2);
    }

    public static void hebin(int[] a, int[] b) {
        int[] hebin = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            hebin[i]=a[i];
        }
        for (int i = 0; i < b.length; i++) {
            hebin[a.length+i]=b[i];
        }
        for (int i = 0; i < hebin.length; i++) {
            System.out.print(hebin[i]+" ");
        }

    }
}
