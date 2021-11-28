package Level1pro;

public class Enemy {
    private final int ATK;
    //一刀999级，快来玩贪玩蓝月
    //王子防御力666点------------------------------------------------------
    public Enemy(int atk) {
       ATK = atk;
    }

    void attack(Dodge dodge){
    dodge.dodgeEnemy(this);
    }
    int getattack(){
        return ATK;
    }
    void attacked(){
        System.out.println("反击成功");
    }
}
