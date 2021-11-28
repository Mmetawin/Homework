package Level1pro;

public class DodgeLv1 extends Dodge {
    @Override
    void dodgeEnemy(Enemy enemy) {
        if(enemy.getattack()>3*DODGE){
            System.out.println("王子逃跑QAQ");
        }else{
            //这里就是链式调用的关键，首先把next拿过来，通过setNext现在它管的对象已经是dodgelv2了
            //后面依次这样
            //现在相当于dodgelv2.dodgeEnemy(enemy)
            //然后因为enemy是传进来的，所以像传家宝一样再传给dodgelv2
            //就是不满足dodgelv1时就调用dodgelv2,以此调下去
            this.getNext().dodgeEnemy(enemy);
        }
    }
}
