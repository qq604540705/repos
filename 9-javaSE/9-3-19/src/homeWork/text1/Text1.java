package homeWork.text1;

/*第一题:
	定义一个字符串s = "Hello-World",利用API完成如下小需求
		1.判断字符串s,与字符串"World"是否相等,并打印出来.
		2.用程序得到字符串"Wo",在字符串s中的起始索引.
		3.得到s中,3号索引对应的字符,打印到控制台上
		4.得到s的长度,打印在控制台上.
		5.获得s中的"Hell"字符串,打印在控制台上.
		6.获得s中的"orld"字符串,打印在控制台上.
		7.将字符串s中的所有o替换为*号.打印在控制台上
		8.将字符串s切割成"Hello"和"World"两个字符串,打印在控制台上
		9.将字符串s变为字符数组,遍历数组将每个字符打印在控制台上*/
public class Text1 {
    public static void main(String[] args) {
        String s = "Hell-World";
//        1.判断字符串s,与字符串"World"是否相等,并打印出来.
        if (s.equals("World") == true) {
            System.out.println("s字符串和World字符串相等");
        } else {
            System.out.println("s字符串和World字符串不相等");
        }
//       2.用程序得到字符串"Wo",在字符串s中的起始索引.
        System.out.println(s.substring(5, 7));
//      3.得到s中,3号索引对应的字符,打印到控制台上
        System.out.println(s.charAt(2));
//        4.得到s的长度,打印在控制台上.
        System.out.println("字符串S的长度是"+s.length());
//        5.获得s中的"Hell"字符串,打印在控制台上.
        System.out.println(s.substring(0,4));
//        6.获得s中的"orld"字符串,打印在控制台上.
        System.out.println(s.substring(6));
//        7.将字符串s中的所有o替换为*号.打印在控制台上
        System.out.println(s.replace('o','*'));
//        8.将字符串s切割成"Hello"和"World"两个字符串,打印在控制台上
        String[] ss=s.split("-");
        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
//        9.将字符串s变为字符数组,遍历数组将每个字符打印在控制台上*/
        for (int a = 0; a < s.length(); a++) {
            System.out.println(s.charAt(a));
        }
    }


}
