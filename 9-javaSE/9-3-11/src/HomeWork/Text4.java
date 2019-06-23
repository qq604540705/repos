package HomeWork;
/*第四题:
	定义一个方法,该方法能多次打印HelloWorld,要求调用该方法,传入一个int类型的参数n,
	要求调用该方法,能通过参数n控制打印HelloWorld的次数.
		当传入0时,HelloWorld不打印
		当传入1时,HelloWorld打印1次
		当传入2时,HelloWorld打印2次
		当传入3时,HelloWorld打印3次*/
public class Text4 {
    public static void main(String[] args) {
//        输入参数n=100;
        hello(100);
    }
//    定义一个方法,该方法能多次打印HelloWorld
//    要求调用该方法,传入一个int类型的参数n,
    public static void hello(int n){
//   参数n控制打印HelloWorld的次数,用循环的思想
        int jishuqi=0;
        for(int a=1;a<=n;a++){
            System.out.println("HelloWorld");
            jishuqi++;
        }
        System.out.println("当前打印次数为"+jishuqi);
    }
}
