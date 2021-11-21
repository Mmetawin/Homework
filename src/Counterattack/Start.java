package Counterattack;

public class Start {
    public static void main(String[] args){
        Hero hero=new Hero(3000,1000,200);
       // System.out.println(hero.hp);
        Monster monster=new Monster(4000,1000,200);
        while(hero.hp>0&&monster.hp>0){
            hero.attack(monster);
            monster.attack(hero);
            if(hero.hp<=0){
                System.out.println("英雄死了呜呜呜");
                break;
            }
        }
    }
}
