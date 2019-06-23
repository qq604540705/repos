package text4;
/*第四题:分析以下需求，并用代码实现
	定义人类Person,包含以下成员：
	 成员属性:
			姓名 name( String类型)
			年龄 age(double类型)

	1.按照以上要求定义Person,属性要私有,生成空参、有参构造，setter和getter方法
	2.定义测试类:根据如下需求创建多个对象(使用满参构造创建,即有参构造).
		老王-35    小芳-23
	3.通过两个对象,比较谁的年龄大,并打印出来.
		例:  老王年龄比较大*/
public class Text4 {
    public static void main(String[] args) {
        person nianji1 = new person("老王", 35);
        person nianji2 = new person("小芳",23);
        if (nianji1.getAge1()>nianji2.getAge1()){
            System.out.println(nianji1.getName1()+"年纪比较大");
        }else{
            System.out.println(nianji2.getName1()+"年纪比较大");
        }
    }
}
