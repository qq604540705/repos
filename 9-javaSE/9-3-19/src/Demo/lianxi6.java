package Demo;

import java.util.Arrays;

public class lianxi6 {
    public static void main(String[] args) {
        String st="一二三四五六七八九";
        char[]ch=st.toCharArray();
        Arrays.sort(ch);
        for (int a = ch.length-1; a >=0; a--) {
            System.out.print(ch[a]);
        }

    }
}
