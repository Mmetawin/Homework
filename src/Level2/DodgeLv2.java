package Level2;

public class DodgeLv2 extends Dodge{
    @Override
    void dodgeEnemy(Enemy enemy) {
        if(enemy.getattack()>2*DODGE){
            System.out.println("王子挡下一击后逃跑QAQ");
        }else{
            //虽然复制粘贴还蛮多的，但好在改动不大
            this.getNext().dodgeEnemy(enemy);
        }
    }
}
