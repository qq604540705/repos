package switch01;

import java.sql.SQLOutput;

//switch 循环语句的练习,
//根据月份判断一个月多少天
public class switch1 {
    public static void main(String []ages){
        int yuefen,day;
        yuefen=13;
        switch(yuefen){
            case 1:
                System.out.println(yuefen+"月为31天");
                break;
            case 3:
                System.out.println(yuefen+"月为31天");
                break;
            case 5:
                System.out.println(yuefen+"月为31天");
                break;
            case 7:
                System.out.println(yuefen+"月为31天");
                break;
            case 8:
                System.out.println(yuefen+"月为31天");
                break;
            case 10:
                System.out.println(yuefen+"月为31天");
                break;
            case 12:
                System.out.println(yuefen+"月为31天");
                break;
            case 4:
                System.out.println(yuefen+"月为30天");
                break;
            case 6:
                System.out.println(yuefen+"月为30天");
                break;
            case 9:
                System.out.println(yuefen+"月为30天");
                break;
            case 11:
                System.out.println(yuefen+"月为30天");
                break;
            case 2:
                System.out.println(yuefen+"月为28天");
                break;
            default:
                System.out.println("输入数字有误");
        }
    }
}
