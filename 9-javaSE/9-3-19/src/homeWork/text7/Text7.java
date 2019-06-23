package homeWork.text7;

import java.util.Scanner;

/*第七题:
	分析以下需求，并用代码实现
	1.定义如下方法public static String getPropertyGetMethodName(String property)
		功能描述:
			(1)该方法的参数为String类型，表示用户传入的参数，返回值类型为String类型，返回值为对应的get方法的名字
			(2)如：用户调用此方法时传入参数为"name",该方法的返回值为"getName"
								   传入参数为"age",该方法的返回值为"getAge"

	2.定义如下方法public static String getPropertySetMethodName(String property)
		功能描述:
			(1)该方法的参数为String类型，表示用户传入的参数，返回值类型为String类型，返回值为对应的set方法的名字
			(2)如：用户调用此方法时传入参数为"name",该方法的返回值为"setName"
								   传入参数为"age",该方法的返回值为"setAge"*/
public class Text7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数组get");
        String st = sc.nextLine();
        System.out.println("请输入一个数组set");
        String st1 = sc.nextLine();

        System.out.println(getPropertySetMethodName(st));
        System.out.println(setPropertyGetMethodName(st1));

    }

    //    方法1
    public static String getPropertySetMethodName(String property) {
        char[] ch = property.toCharArray();
        ch[0] = (char) (ch[0] - 32);
        String st = "get";
        for (int a = 0; a < ch.length; a++) {
            st = st.concat(ch[a] + "");
        }
        return st;
    }

    //    方法2
    public static String setPropertyGetMethodName(String property) {
        char[] ch = property.toCharArray();
        ch[0] = (char) (ch[0] - 32);
        String st = "set";
        for (int a = 0; a < ch.length; a++) {
            st = st.concat(ch[a] + "");
        }
        return st;
    }
}