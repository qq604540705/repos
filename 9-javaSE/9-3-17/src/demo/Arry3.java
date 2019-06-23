package demo;

import java.util.ArrayList;

/*  1.创建结合对象,集合泛型是 student
    2.添加学生对象
    3.遍历集合
*/
public class Arry3 {
    public static void main(String[] args) {
//        创建一个集合
        ArrayList<Student> arr=new ArrayList<Student>();
        Student stu1=new Student("唐僧",25);
        Student stu2=new Student("孙悟空",600);
        Student stu3=new Student("猪八戒",1500);
        Student stu4=new Student("沙和尚",2000);
        arr.add(stu1);
        arr.add(stu2);
        arr.add(stu3);
        arr.add(stu4);
        for (int x = 0; x < arr.size(); x++) {
            Student student = arr.get(x);
            System.out.println(student.getName()+student.getAge());
        }
    }
}
