package text;

import java.util.ArrayList;
import java.util.List;

public class Text1 {
    public static void main(String[] args) {
        List<String > list=new ArrayList<>();
        List<String> num = list(list);
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
    }
    public static List<String> list (List<String> list){
        list.add("古力娜扎");
        list.add("马尔扎哈");
        return list;
    }
}
