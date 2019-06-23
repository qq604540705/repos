package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/*随机生成10个1-100之间的数,并存入集合中
* */
public class Arry5 {
    public static void main(String[] args) {
//        创建随机数对象和集合对象
        Random ra=new Random();
        ArrayList<Integer> ar=new ArrayList<Integer>();
//        随机生成10个随机数
        for (int a = 0; a < 10; a++) {
            int num=ra.nextInt(100)+1;
            ar.add(num);
        }
        for (int a = 0; a < ar.size(); a++) {
            System.out.println("num="+ar.get(a));
        }
    }
}
