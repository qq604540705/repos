package homework.text5;

import java.util.ArrayList;

/*第五题:
	a.定义"电动汽车类"Ecar,包含:
		1)构造方法: 空参构造、满参构造；
		2)成员变量:
					品牌 brand（String类型）
					价格price（int类型）
					续航mile（int类型）；
		3)成员方法:所有成员变量的set/get方法；

	b.定义测试类EcarTest,完成以下需求:
		1)定义public static ArrayList<Ecar> filter(ArrayList<Ecar> list,int price ,int mile) 方法,
		要求:
			遍历list集合，将list中价格低于参数price,并且续航不低于参数mile的元素存入到另一个ArrayList<Ecar> 中并返回；

		2）定义main(String[] args)方法,要求:
			根据以下内容创建并初始化3个Ecar对象,
			{"威马EX5",179800,400},{"蔚来ES8", 448000,500},{"特斯拉ModelX",828000,552}，

		    创建一个ArrayList<Ecar> list_ecar，将上面的3个Ecar对象添加到list_ecar中，
			调用filter方法传入list_ecar,500000和400，根据返回的list集合输出所有元素信息；
		示例如下:
			威马EX5 179800元 400公里
			蔚来ES8 448000元 500公里*/
public class Text5 {
    public static void main(String[] args) {
        Ecar car1=new Ecar("威马EX5",179800,400);
        Ecar car2=new Ecar("蔚来ES8",448000,500);
        Ecar car3=new Ecar("特斯拉ModelX",828000,552);
        ArrayList<Ecar> ecar=new ArrayList<>();
        ecar.add(car1);
        ecar.add(car2);
        ecar.add(car3);
        ArrayList<Ecar> ecar1=filter(ecar,500000,400);
        for (int i = 0; i < ecar1.size(); i++) {
            System.out.println(ecar.get(i).getBrand()+" "+ecar.get(i).getPrice()+"元 "+ecar.get(i).getMile()+"公里");
        }

    }
    public static ArrayList<Ecar>filter(ArrayList<Ecar>list,int price,int mile){
        ArrayList<Ecar>list2=new ArrayList<>();
        for (int a = 0; a < list.size(); a++) {
            if (list.get(a).getPrice()<price&&list.get(a).getMile()>=mile){
                list2.add(list.get(a));
            }
        }
        return list2;
    }
}
