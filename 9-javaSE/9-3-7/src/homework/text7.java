package homework;

public class text7 {
    public static void main(String[] args) {
        public static void main(String[] args) {
            int a; //int a = 0;
            System.out.println(a); //没赋值直接使用
            {
                int c = 20;
                System.out.println(c);
            }
            c = 30;//c取不到值  int c = 30;
            System.out.println(c);//c取不到值
        }
    }



    public class Test02 {
        public static void main(String[] args) {
            byte b = 3;
            b = b + 4;//需要强转  b = (byte)(b+4);  b+=4;
            System.out.println("b=" + b);
        }
    }



    public class Test07 {
        public static void main(String[] args) {
            int x = 2;
            {
                int y = 6;
                System.out.println("x is " + x);
                System.out.println("y is " + y);
            }
            y = x; //y取不到值  int y = x;
            System.out.println("x is " + x);
    }
}
