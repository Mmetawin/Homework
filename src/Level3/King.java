package Level3;

import java.util.ArrayList;
import java.util.List;

abstract class King {
    ArrayList<Soldier> soldiers=new ArrayList<>();
    abstract void review();
    //这个add搞了好久，要放在函数里才能用，
    //之前学的时候是放在main里add的，这里我们就放在自己写的函数里，然后调用这个函数来add就好
    public void add(Soldier solider){
            soldiers.add(solider);
    }
    public void remove(Soldier solider){
        soldiers.remove(solider);
    }
}
