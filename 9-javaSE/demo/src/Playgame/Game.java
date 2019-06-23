package Playgame;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int count;
    Player p = new Player();
    Monster m = new Monster();
    Scanner sc = new Scanner(System.in);

    public void choose() {
        System.out.println("选择人物");
        System.out.println("0.女");
        System.out.println("1.男");
        String st = sc.nextLine();
        if (st.equals("0")) {
            p.name = "男";
            p.hp = 120;
            p.att = 50;
            p.def = 5;
        } else if (st.equals("1")) {
            p.name = "女";
            p.hp = 80;
            p.att = 80;
            p.def = 0;
        } else {
            System.out.println("输入有误");
        }
        p.show();
    }

    public void monster() {
        Random r = new Random();
        int rod = r.nextInt(3);
        if (rod == 0) {
            m.name = "小蜜蜂";
            m.hp = 30;
            m.att = 10;
            m.def = 10;
        } else if (rod == 1) {
            m.name = "小青蛇";
            m.hp = 30;
            m.att = 30;
            m.def = 5;
        } else if (rod == 2) {
            m.name = "毒蛇";
            m.hp = 20;
            m.att = 50;
            m.def = 5;
        }
        m.show();
    }


    public  void play() {
        System.out.println("请输入y游戏开始/输入n游戏结束");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        if (st.equals("y")) {
            System.out.println("游戏开始");
            choose();
            monster();
            System.out.println("----------------");
            System.out.println("遇到" + m.name);
            System.out.println("输入0/1   0:攻击 1:防御 ");
            String st1 = sc.nextLine();
            if (st1.equals("0")) {
                int dhp;//人物剩余血量=攻击-防御
                dhp = p.hp - (m.att - p.def);
                if (dhp > 0) {//判断剩余血量以及显示伤害
                    System.out.println("-" + (m.att - p.def));
                }
                p.show();
                m.show();
            }
        } else if (st.equals("n")) {
            System.out.println("游戏结束");
        } else {
            System.out.println("输入有误");
        }
    }
}
