package text2;
/*1.猫类Cat
		属性:
			毛的颜色color
			品种breed
		行为:
			吃饭eat()
			抓老鼠catchMouse()*/
public class Cat {
    private String color;
    private String breed;
//    属性要私有,生成空参、有参构造，setter和getter方法

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    /*			花色的波斯猫正在吃鱼.....
			花色的波斯猫正在逮老鼠....*/
    public void eat(){
        System.out.println(color+breed+"正在吃鱼");
    }
    public void catchMouse(){
        System.out.println(color+breed+"正在逮老鼠");
    }
}
