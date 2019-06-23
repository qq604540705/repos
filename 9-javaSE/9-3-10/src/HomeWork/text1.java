package HomeWork;
/*第九题:
	分析以下需求，并用代码实现：
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
			控制台输出:3月份是春季
			以if语句的第三种格式将代码完成
			if...else if....else...
*/
public class text1 {
     public static void main(String[] args){
        int jijie=3;
        if(jijie==1){
            System.out.println("当天输入的"+jijie+"月为冬季");
        }
        else if(jijie==2){
            System.out.println("当天输入的"+jijie+"月为冬季");
        }
        else if(jijie==3){
            System.out.println("当天输入的"+jijie+"月为春季");
        }
        else if(jijie==4){
            System.out.println("当天输入的"+jijie+"月为春季");
        }
        else if(jijie==5){
            System.out.println("当天输入的"+jijie+"月为春季");
        }
        else if(jijie==6){
            System.out.println("当天输入的"+jijie+"月为夏季");
        }
        else if(jijie==7){
            System.out.println("当天输入的"+jijie+"月为夏季");
        }
        else if(jijie==8){
            System.out.println("当天输入的"+jijie+"月为夏季");
        }
        else if(jijie==9){
            System.out.println("当天输入的"+jijie+"月为秋季");
        }
        else if(jijie==10){
            System.out.println("当天输入的"+jijie+"月为秋季");
        }
        else if(jijie==11){
            System.out.println("当天输入的"+jijie+"月为秋季");
        }
        else if(jijie==12){
            System.out.println("当天输入的"+jijie+"月为冬季");
        }
        else{
            System.out.println("输入数据有误");
        }

    }
}
