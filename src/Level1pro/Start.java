package Level1pro;
import java.util.Scanner;
//自定义异常类
class outofatkException extends Exception{
    public outofatkException(String msg){
        super(msg);
    }
}
public class Start {
    public static void main(String[] args) {
        DodgeLv1 d1 = new DodgeLv1();
        DodgeLv2 d2 = new DodgeLv2();
        DodgeLv3 d3 = new DodgeLv3();
        DodgeLv4 d4 = new DodgeLv4();
        //将dodgexxx去给上一级的那个next赋值------------------------------------*****************************
        d1.setNext(d2);
        d2.setNext(d3);
        d3.setNext(d4);
        //利用构造函数去给Enemy类中的ATK赋值-------------------------------------*************************
        //王子防御力666点-----------------------------------------------------*************************
        Scanner in = new Scanner(System.in);
       int attack = 100;
        //使用异常控制敌人的攻击力不能过大
        while (true) {
            try {
                attack = in.nextInt();
                if (attack > 6666) {
                    throw new outofatkException("攻击力这么强王子很没面子，请重新输入");
                }
                break;
            } catch (outofatkException e) {
                System.out.println(e);
            }
        }
            Enemy enemy = new Enemy(attack);
            //调用一次攻击--------------------------------------------------------*****************************
            enemy.attack(d1);


    }
}
