package Playgame;

public class Player {
    String name;//名字
    int hp;//血量
    int att;//攻击力
    int def;//防御力
    public int attack(int def){//计算造成的伤害值
        return att-def;
    }
    public void show(){//显示自身属性
        System.out.println("名字:"+name+" 血量:"+hp+" 攻击力:"+att+" 防御力"+def);
    }

    public Player() {
    }

    public Player(String name, int hp, int att, int def) {
        this.name = name;
        this.hp = hp;
        this.att = att;
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
