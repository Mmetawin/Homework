package Level2;

import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        DodgeLv1 d1=new DodgeLv1();
        DodgeLv2 d2=new DodgeLv2();
        DodgeLv3 d3=new DodgeLv3();
        DodgeLv4 d4=new DodgeLv4();
        //将dodgexxx去给上一级的那个next赋值------------------------------------*****************************
        d1.setNext(d2);
        d2.setNext(d3);
        d3.setNext(d4);
        //利用构造函数去给Enemy类中的ATK赋值-------------------------------------*************************
        //王子防御力666点-----------------------------------------------------*************************
        Scanner in=new Scanner(System.in);
        Enemy enemy=new Enemy(in.nextInt());
        //调用一次攻击--------------------------------------------------------*****************************
        enemy.attack(d1);
    }


}
