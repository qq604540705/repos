package Demo;

import java.util.ArrayList;

public class lianxi3 {
    public static void main(String[] args) {
        ArrayList<String>arr=new ArrayList<String>();
        arr.add("张三丰");
        arr.add("灭绝师太");
        arr.add("张翠山");
        arr.add("殷素素");
        arr.add("张无忌");
        arr.add("赵敏");
        ArrayList<String>arr1=new ArrayList<String>();
        for (int a = 0; a < arr.size(); a++) {
            if(arr.get(a).substring(0,1).equals("张")){
                arr1.add(arr.get(a));
            }
        }
        for (int a = 0; a < arr1.size(); a++) {
            System.out.println(arr1.get(a));
        }
    }
}
