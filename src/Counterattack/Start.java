package Counterattack;

import java.util.Scanner;
 class outofhpException extends Exception{
    public outofhpException(String msg){
        super(msg);
    }
}
public class Start {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int heroHp=10;
        System.out.println("请输入英雄生命力");
        //使用异常控制英雄血量，当输入的英雄血量大于9999时要求用户重新输入---------------------------------------------------
        while (true){
            try {
                heroHp = in.nextInt();
                if (heroHp > 9999) {
                    throw new outofhpException("英雄没这么肉啦，重新输入噢");
                }
                break;
            } catch (outofhpException e) {
                System.out.println(e);
            }
        }
        Hero hero = new Hero(heroHp, 1000, 200);
        int monsterHp = 10;
        System.out.println("请输入小兵生命力");
        //使用异常控制小兵血量，当输入小的兵血量大于8888时要求用户重新输入---------------------------------------------------
        while(true)try {
           monsterHp = in.nextInt();
            if (monsterHp > 8888) {
                throw new outofhpException("小兵这么肉英雄会罢工滴，请重新输入");
            }
            break;
        } catch (outofhpException e) {
            System.out.println(e);
        }
        Monster monster = new Monster(monsterHp, 1000, 200);

        //开始打架，小兵攻击英雄后英雄没死会反击
        while (hero.hp > 0 && monster.hp > 0) {
            hero.attack(monster);
            if(monster.hp<=0){
                System.out.println("英雄胜利战斗结束");
                break;
            }
            monster.attack(hero);
            if (hero.hp <= 0) {
                System.out.println("英雄死了呜呜呜---");
                break;
            }

        }
    }
}
