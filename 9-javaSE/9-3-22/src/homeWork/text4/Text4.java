package homeWork.text4;
/*第四题:
		根据要求完成以下功能：
			① 定义接口Bluetooth，要求如下：
					定义抽象方法： void btFunction()
					定义默认方法： void connecting()，要求：输出"可以连接WIFI"

			② 定义抽象类Phone，要求如下：
					包含空参、满参构造和以下成员变量
					名称name（ String 型）
					生成所有成员变量set/get方法
					定义抽象方法：void playMusic(Song song)

			③定义类Song
				   包含空参、满参构造和以下成员变量
					歌手 singer（String 型）
					歌名 name（ String 型）
					生成所有成员变量set/get方法

			④ 定义类IPhone，要求如下：
					继承抽象类 Phone，实现接口 Bluetooth
					构造方法包括：空参构造和满参构造方法(String)
					重写抽象方法：
						void btFunction()，要求：输出"支持WIFI功能"
						void playMusic(Song song)，要求：输出打印"XXX手机正在播放YYY唱的ZZZ"
				PS：XXX是Phone类中的 name属性值，YYY是Song 类中的 singer属性值，ZZZ是Song 类中的 name属性值

			⑤ 定义测试类Test，在main方法实现以下功能：
			   创建并初始化一个IPhone 对象phone和一个Song 对象s，调用phone的 btFunction()、
			   connecting()和playMusic(Song song)方法,打印如下:
				支持WIFI功能
				可以连接WIFI
				华为手机正在播放周杰伦唱的菊花残*/
public class Text4 {
    public static void main(String[] args) {
        Iphone phone=new Iphone();
        Song S=new Song();
        phone.btFunction();
        phone.connecting();
        phone.playMusic("华为","周杰伦","菊花残");
    }
}
