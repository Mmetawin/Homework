package Level2;

abstract class Dodge {

        public Dodge next;
        final int DODGE=666;
        //抽象函数-----------------------------------
        abstract void dodgeEnemy(Enemy enemy);

        //使用两个普通函数，主要对next的初始化和得到进行操作----------------------------------
        public void setNext(Dodge lvn){
                this.next=lvn;
        }
        public Dodge getNext() {
                return next;
        }
}
