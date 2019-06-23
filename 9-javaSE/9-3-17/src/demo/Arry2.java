package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arry2 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("玄冥二老");
        arr.add("风清扬");
        arr.add("张三丰");
        arr.add("独孤求败");
        /*for (int a = 0; a < arr.size(); a++) {
            System.out.println(arr.get(a));
        }*/
        arr.set(0,"扫地僧");
/*       for (int a = 0; a < arr.size(); a++) {
            System.out.println(arr.get(a));
        }*/
        arr.remove(3);
        for (int x = 0; x < arr.size(); x++) {
            System.out.println(arr.get(x));
        }
    }
}
