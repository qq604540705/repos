package fanye.lianxi.shopPhone;

import fanye.lianxi.phone.Phone;
/*因为在同一个包下,所以不需要带入包,若不在同一个包下,首先先需要导入包;
    格式为;import包名称.类名称*/
public class shop {
    public static void main(String[] args) {
    /*先新建一个对象
   格式为 类名称*/
        Phone iphone=new Phone(){};
        System.out.println("购买一个手机,型号是"+iphone.xinghao);
        System.out.println("购买的价格为"+iphone.price);
        System.out.println("手机的颜色为"+iphone.color);
        iphone.call("乔布斯");
        iphone.takeOut();
    }
}
