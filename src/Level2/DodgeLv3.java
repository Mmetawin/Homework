package Level2;

public class DodgeLv3 extends Dodge{
    @Override
    void dodgeEnemy(Enemy enemy) {
        if(enemy.getattack()>DODGE){
            System.out.println("王子挡下此次攻击并反击！！！");
            //这里和前面不一样，使用回调调用Enemy里的函数进行反击--------------------------------------------------
            enemy.attacked();
        }else{
            //虽然复制粘贴还蛮多的，但好在改动不大
            this.Dedaonext().dodgeEnemy(enemy);
        }
    }
}
