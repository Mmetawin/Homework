package Level2;

public class DodgeLv4 extends Dodge {
    @Override
    void dodgeEnemy(Enemy enemy) {
        if (enemy.getattack() <=DODGE){
            System.out.println("老子直接开干！！！");
            //使用回调调用Enemy里的函数进行反击---------------------------------------
            enemy.attacked();
        }
    }
}