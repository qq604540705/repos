package HomeWork;
/*第二题:
	1.定义两个变量代表长方形的长和宽
		定义方法计算该长方形的周长,并在main方法中打印周长
	2.定义两个变量代表长方形的长和宽
		定义方法计算该长方形的面积,并在main方法中打印面积
	3.定义一个变量代表圆的半径(π取3.14)
		定义方法计算该圆的周长,并在main方法中打印周长
	4.定义一个变量代表圆的半径(π取3.14)
		定义方法计算该圆的面积,并在main方法中打印面积*/
public class Text2 {
    public static void main(String[] args) {
//  在main方法中打印周长
        System.out.println("长方形的周长为" + zhouchang1(2, 4));
//  在main方法中打印面积
        System.out.println("长方形的面积为" + mianji1(2, 4));
//      在main方法中打印圆的周长
        System.out.println("圆的周长为" + yuan1(1.5));
//  在main方法中打印圆的面积
        System.out.println("圆的面积为"+yuan2(1.5));
    }

    //    定义方法计算该长方形的周长
    public static double zhouchang1(double chang, double kuan) {
        double zhouchang;
        return zhouchang = (chang + kuan) * 2;
    }

    //    定义方法计算该长方形的面积
    public static double mianji1(double chang, double kuan) {
        double mianji;
        return mianji = chang * kuan;
    }

    //   定义方法计算该圆的周长
    public static double yuan1(double banjin) {
        double yuan;
        double pai = 3.14;
        return yuan = 2 * banjin * pai;
    }

    //   定义方法计算该圆的面积
    public static double yuan2(double banjin) {
        double yuan;
        double pai = 3.14;
        return yuan = pai * banjin * banjin;
    }
}
