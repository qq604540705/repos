package homework.text1;

import java.util.ArrayList;

/*第一题:
	1.创建TPhone类，包含如下属性
  		品牌
  		价格
  		使用年限
    2.在测试类中，利用满参构造创建4个对象，将对象存入集合中。
       华为-1200-4  苹果-9000-1  锤子-3000-3  小米-1800-2
    3.遍历集合，将使用年限小于2或价格低于2000的手机筛选出来。
    4.在控制台上打印所有筛选出来的对象（格式：华为-1200-4）*/
public class Text1 {
    public static void main(String[] args) {
        Tphone phone1=new Tphone("华为",1200,4);
        Tphone phone2=new Tphone("苹果",9000,1);
        Tphone phone3=new Tphone("锤子",3000,3);
        Tphone phone4=new Tphone("小米",1800,2);
        ArrayList<Tphone> arr=new ArrayList<Tphone>();
        arr.add(phone1);
        arr.add(phone2);
        arr.add(phone3);
        arr.add(phone4);
        for (int a = 0; a < arr.size(); a++) {
            if(arr.get(a).jiage<2000|arr.get(a).limit<2){
                System.out.println(arr.get(a).pingpai+"-"+arr.get(a).jiage+"-"+arr.get(a).limit);
            }
        }

    }
}
