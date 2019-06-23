package Demo;

import java.util.Scanner;

/*模拟用户登入*/
public class lianxi1 {
    public static void main(String[] args) {
        String urse ="admin";
        String pass ="123456";
        String check = "BJUI";

        Scanner cs=new Scanner(System.in);
        System.out.println("请输入您的账号");
        String urse1=cs.nextLine();
        System.out.println("请输入您的密码");
        String pass1=cs.nextLine();
        System.out.println("请输入验证码 BJUI");
        String check1=cs.nextLine();

        if (urse.equals(urse1)&&(pass.equals(pass1))&&(check.equalsIgnoreCase(check1))){
            System.out.println("登录成功");
        }
        else if(urse.equals(urse1)&&(pass.equals(pass1))){
            System.out.println("您输入的验证码有误");
        }
        else if(check.equalsIgnoreCase(check1)){
            System.out.println("您输入的账号密码有误");
        }
    }
}
