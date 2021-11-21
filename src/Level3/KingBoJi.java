package Level3;

public class KingBoJi extends King{
    @Override
    void review() {
        System.out.println("同志们好，同志们辛苦了");
        //本来加一个西梁女王后感觉不能用foreach了
        //因为觉得波吉国王和西梁女王分别阅同一个数组里的兵
        //所以本来又改成了一个一个去调用，后来发现不同类数组不一样的
        //虽然都用的父类的数组但是是不同的两个数组
        //虽然其实是我傻了吧唧的，但是西梁女王yyds，学到了-----------------------------------------------------
        for (Soldier soldier:soldiers)
        {
            soldier.response();
        }
//        soldiers.get(0).response();
//        soldiers.get(1).response();
//        soldiers.get(2).response();

    }
  //  King boji=new KingBoJi;

}
