package Level2;

import java.io.IOException;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        FileWriteRead f=new FileWriteRead();
        System.out.println("请向文件中输入一段你喜欢的文字吧");
        //输入：唯日月星辰与信仰亘古不变，永远少年
        String str=in.next();
        f.writeString(str);
        System.out.println("让我们看看写了多长吧");
        FileWriteRead.getlength();
        System.out.println("让我们看看你写了啥吧");
        //输出：唯日月星辰与信仰亘古不变，永远少年
        f.readString();

    }
}
