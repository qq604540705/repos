package homework.text6;

import java.util.ArrayList;

/*第六题:
	 1.创建Student类，包含如下属性
  		姓名
  		年龄
  		学历
	  2.在测试类中，利用满参构造创建3个对象，将对象存入集合中。
		小红  12 小学          小米 21 大学        小明 14 初中
	  3.遍历集合，将年龄小于15的人的学历改为幼儿园。
	  4.在控制台上打印所有对象（格式：小红-12-幼儿园）*/
public class Text6 {
    public static void main(String[] args) {
        Student st1=new Student("小红",12,"小学");
        Student st2=new Student("小米",21,"大学");
        Student st3=new Student("小明",14,"初中");
        ArrayList<Student>students=new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        for (int a = 0; a < students.size(); a++) {
            if(students.get(a).age<15){
                students.get(a).school="幼儿园";
            }
        }
        for (int a = 0; a < students.size(); a++) {
            System.out.println(students.get(a).name+"-"+students.get(a).age+"-"+students.get(a).school);
        }
    }
}
