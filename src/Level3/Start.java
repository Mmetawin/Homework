package Level3;

public class Start {
    public static void main(String[] args){
        Soldier1 soldier1=new Soldier1();
        Soldier2 soldier2=new Soldier2();
        Soldier3 soldier3=new Soldier3();
        WomenSoldier1 womenSoldier1=new WomenSoldier1();
        WomenSoldier2 womenSoldier2=new WomenSoldier2();
        WomenSoldier3 womenSoldier3=new WomenSoldier3();
        King boji=new KingBoJi();
        //女儿国国王叫西梁女王
        King xiliang=new WomensKing();
        boji.add(soldier1);
        boji.add(soldier2);
        boji.add(soldier3);
        xiliang.add(womenSoldier1);
        xiliang.add(womenSoldier2);
        xiliang.add(womenSoldier3);
        System.out.println("有请波吉国王阅兵----------");
        boji.review();
        System.out.println("有请西梁女王讲两句----------");
        xiliang.review();
    }
}
