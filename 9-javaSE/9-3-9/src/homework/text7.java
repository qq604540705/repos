package homework;
/*1.定义一个整数代表一个学生成绩(int类型)
	2.判断该学生成绩是否及格
	3.打印格式：
		成绩>=60:输出 true
		成绩<60: 输出 false

	提示：可以使用 三元算术运算符实现
* */
public class text7 {
    public static void main(String[] args) {
        int chengji=80;
        boolean jieguo = chengji<60?false:true;
        System.out.println(jieguo);

    }
}
