package HomeWork;
/*	分析以下需求，并用代码实现, 用switch语句实现：
	1.功能描述:定义一个变量代表月份，输出对应的季节
	2.要求:
		(1)定义一个整数(代表月份,范围1-12)
		(2)输出该月份对应的季节
			3,4,5春季
			6,7,8夏季
			9,10,11秋季
			12,1,2冬季
		(3)演示格式如下:
			月份:3
			控制台输出:3月份是春季*/
/*switch语句
switch(表达式){
  case 常量值1:
  语句体1;
  break;
  default
  语句体
  break}*/
public class text4 {
    public static void main(String[] args) {
//定义一个月份的变量
        int yuefen=3;
        switch (yuefen){
            case 1:
                System.out.println("输入"+yuefen+"月的季节为冬季");
            break;
            case 2:
                System.out.println("输入"+yuefen+"月的季节为冬季");
                break;
            case 3:
                System.out.println("输入"+yuefen+"月的季节为春季");
                break;
            case 4:
                System.out.println("输入"+yuefen+"月的季节为春季");
                break;
            case 5:
                System.out.println("输入"+yuefen+"月的季节为春季");
                break;
            case 6:
                System.out.println("输入"+yuefen+"月的季节为夏季");
                break;
            case 7:
                System.out.println("输入"+yuefen+"月的季节为夏季");
                break;
            case 8:
                System.out.println("输入"+yuefen+"月的季节为夏季");
                break;
            case 9:
                System.out.println("输入"+yuefen+"月的季节为秋季");
                break;
            case 10:
                System.out.println("输入"+yuefen+"月的季节为秋季");
                break;
            case 11:
                System.out.println("输入"+yuefen+"月的季节为秋季");
                break;
            case 12:
                System.out.println("输入"+yuefen+"月的季节为冬季");
                break;

        }

    }
}
