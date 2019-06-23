package homework;
/*1.功能描述:定义一个变量代表月份，输出对应的季节
	2.要求:
		(1)定义一个整数(代表月份,范围1-12)
		(2)输出该月份对应的季节
			3,4,5春季
			6,7,8夏季
			9,10,11秋季
			12,1,2冬季
		(3)演示格式如下:
			月份:3
			控制台输出:3月份是春季
* */
public class text9 {
    public static void main(String[] args) {
        int yuefen;   //0<yuefen<13
        yuefen = 14;
        String a=(yuefen==3?yuefen+"月份是春季":(yuefen==4?yuefen+"月份是春季":(yuefen==5?yuefen+"月份是春季":(yuefen==6?yuefen+"月份是夏季":(yuefen==7?yuefen+"月份是夏季":(yuefen==8?yuefen+"月份是夏季":(yuefen==9?yuefen+"月份是秋季":(yuefen==10?yuefen+"月份是秋季":(yuefen==11?yuefen+"月份是秋季":(yuefen==12?yuefen+"月份是冬季":(yuefen==1?yuefen+"月份是冬季":(yuefen==2?yuefen+"月份是冬季":"数据输入有误"))))))))))));
        System.out.println(a);
    }
}
