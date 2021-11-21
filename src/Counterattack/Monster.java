package Counterattack;

public class Monster {
    public int hp;
    public int ack;
    public int def;
    public Monster(int hp, int ack, int def){
        this.hp=hp;
        this.ack=ack;
        this.def=def;
    }
    public void attack(Hero hero){
        hero.hp=hero.hp-(ack-hero.def);
        if(hero.hp<=0){
            hero.hp=0;
        }
        System.out.println("英雄被攻击，血量还剩"+hero.hp);
        if(hero.hp>0){
            //回调来反击--------------------------------------------------------
            hero.conterAttack(this);
        }
    }
}
