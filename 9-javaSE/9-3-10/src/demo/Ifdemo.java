package demo;
//用if else 判断语句,判断a,b,c三个变量的大小
@SuppressWarnings("ALL")
public class Ifdemo {
    public static void main(String[] args){
      int a,b,c,max;
      a=10;
      b=5;
      c=5;
//      判断a>b的大小
      if(a>b){
//           在a>b的情况下,再判断a和c的大小
              if(a>c){
                  max=a;
              }
              else{
                  max=c;
              }
      }
      else {
//              在a<b的情况下,再判b和c的大小
              if (b > c) {
                  max = b;
              } else{
                  max = c;
              }
      }
        System.out.println(max);
    }
}
