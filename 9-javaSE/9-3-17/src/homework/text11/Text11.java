package homework.text11;

import java.util.ArrayList;
import java.util.Random;

/*第十一题:
	分析一下需求,并用代码实现
		1.创建一个储存整数的集合,随机产生10个两位数存入集合
		2.定义一个方法,将集合传入,筛选出其中所有小于50的元素,存入新的集合中,将新集合返回
		3.在主方法中,调用2中的方法,将1中的集合传入,得到返回的集合,将返回的集合遍历打印.*/
public class Text11 {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 11; i++) {
            arr.add(r.nextInt(90)+10);
        }
        System.out.print("集合中小于50的数为 ");
        for (int a = 0; a < list(arr).size(); a++) {
            System.out.print(list(arr).get(a)+" ");
        }
    }
    public static ArrayList<Integer>list(ArrayList<Integer> a){
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i)<50){
            list.add(a.get(i));
            }
        }
        return list;
    }
}
