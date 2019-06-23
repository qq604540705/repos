package HomeWork;
/*题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
假如兔子都不死，问每个月的兔子总数为多少？*/
public class tuzi {
    public static void main(String[] args) {
//首先每个月的时间自增1个月;
        int sum=2;
        int max,tuzi1=2;
        for(int moon=3;moon<=99999;moon++){
//            兔子的初始量为2;
//            从出生后第3个月起每个月都生一对兔子
          max=tuzi1;
          tuzi1=sum+tuzi1;
          sum=max;
            System.out.println("第"+moon+"月的兔子个数为"+tuzi1);
        }

    }
}
