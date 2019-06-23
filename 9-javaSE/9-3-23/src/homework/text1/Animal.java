package homework.text1;
/*1)创建Animal（动物）抽象类，包含：
   成员属性：品种（breed），String类型。*/
public abstract class Animal {
     String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
