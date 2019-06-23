package demo;

import java.sql.SQLOutput;

/*
用switch完成输入变量1-12月份,打印季节
switch(表达式){
    case 常量
    语句体
    break
    case 常量2
    语句体2
    break
    ...
    default
    语句体
    break

}
 */
public class switch1 {
    public static void main(String[] args){
    int yuefen=1;
    switch(yuefen) {
        case(1):
            System.out.println("输入的月份是"+yuefen+"月季节是冬季");
            break;
        case(2):
            System.out.println("输入的月份是"+yuefen+"月季节是冬季");
            break;
        case(3):
            System.out.println("输入的月份是"+yuefen+"月季节是春季");
            break;
        case(4):
            System.out.println("输入的月份是"+yuefen+"月季节是春季");
            break;
        case(5):
            System.out.println("输入的月份是"+yuefen+"月季节是春季");
            break;
        case(6):
            System.out.println("输入的月份是"+yuefen+"月季节是夏季");
            break;
        case(7):
            System.out.println("输入的月份是"+yuefen+"月季节是夏季");
            break;
        case(8):
            System.out.println("输入的月份是"+yuefen+"月季节是夏季");
            break;
        case(9):
            System.out.println("输入的月份是"+yuefen+"月季节是秋季");
            break;
        case(10):
            System.out.println("输入的月份是"+yuefen+"月季节是秋季");
            break;
        case(11):
            System.out.println("输入的月份是"+yuefen+"月季节是秋季");
            break;
        case(12):
            System.out.println("输入的月份是"+yuefen+"月季节是冬季");
            break;
        default:
            System.out.println("输入数据有误");
            break;
        }
    }
}

