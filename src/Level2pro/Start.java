package Level2pro;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //使用序列化以二进制的方式进行对象读写
        ObjectWriteRead wr=new ObjectWriteRead();
        Hero hero[]={new Hero("耀","星光荡开宇宙，本人闪耀其中,我是耀，闪闪发光的耀"),new Hero("西施","闪闪发光的队长，你好")};
        wr.Write(hero);
        Object hero2[]=wr.read();
        for(int i=0;i<hero2.length;i++){
            Hero H=(Hero)hero2[i];
            System.out.println(H);
        }
    }
}
