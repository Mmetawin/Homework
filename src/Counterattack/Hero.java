package Counterattack;

public class Hero implements ATKBACK{
    public int hp;
    public int ack;
    public int def;
    public  Hero(int hp, int ack, int def){
        this.hp=hp;
        this.ack=ack;
        this.def=def;
    }
    public void attack(Monster monster){
           monster.hp= monster.hp-(ack- monster.def);
        if(monster.hp<=0){
            monster.hp=0;
        }
        System.out.println("小兵被攻击，血量还剩"+monster.hp);
    }
    @Override
    public void conterAttack(Monster monster) {
            System.out.print("英雄反击"+",");
            System.out.println("小兵血量还剩"+(monster.hp-200));
    }
}
