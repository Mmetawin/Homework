package Level3;

public class WomensKing extends King{
    @Override
    void review() {
        System.out.println("有男人来啦");
        for (Soldier soldier:soldiers)
        {
        soldier.response();
        }
//        soldiers.get(0).response();
//        soldiers.get(1).response();
//        soldiers.get(2).response();
    }
}
