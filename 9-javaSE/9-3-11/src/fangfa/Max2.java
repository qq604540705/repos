package fangfa;
//有方法实现 1-x之间的奇数和
public class Max2 {
    public static void main(String[] args) {
        int a=max2(9999);
        System.out.println("1-x之间的奇数和为"+a);
        System.out.println("1-x之间的奇数和为"+max2(9999));
        max2(9999);
    }
  /*方法的2个明确:
       1.方法的返回值类型:int;
       2.传参列表:int x;
   */
  public static int max2(int x){
      int max2=0;
      for (int i = 1; i <= x; i++) {
          if(i%2 ==1){
             max2 += i;
          }
      }
      System.out.println("该代码被执行");
      return max2;
  }
}
