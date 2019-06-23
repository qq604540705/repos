package fangfa;
//用方法打印一个矩形
public class Text2 {
//先不用方法打印一个矩形
    /*public static void main(String[] args) {
        int a=0;
        for(int b=0;b<20;b++){
            System.out.print("*");
            a++;
            if(a%5==0){
                System.out.println();
            }
        }
    }*/
//    用方法答应一个矩形
    public static void main(String[] args) {
//        调用方法
        juxing();
    }
//    先新建一个方法 juxin
//    然后在方法里面写上需要完成的功能
    public  static void juxing() {
        int a = 0;
        for (int b = 0; b < 20; b++) {
            System.out.print("*");
            a++;
            if (a % 5 == 0) {
                System.out.println();
            }
        }
    }
}
