package demo;

import java.util.ArrayList;

public class Arry4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(999);
        arr.add(888);
        arr.add(777);
        int sum=0;
        for (int x = 0; x < arr.size(); x++) {
            sum+=arr.get(x);
        }
        System.out.println("sum = " + sum);
    }
}
