package Level2;

import java.io.*;

public class FileWriteRead {
        public static String str="";
    void writeString(String string) throws IOException {
        File f=new File("D:"+File.separator+"sentence.txt");
            Writer out=new FileWriter(f);
             this.str=string;
            out.write(str);
            out.close();
        System.out.println(str.length());
    }
    void readString()throws IOException{
        File f=new File("D:"+File.separator+"sentence.txt");
        Reader read=new FileReader(f);
        char a[]=new char[100];
        int length=read.read(a);
        read.close();
        System.out.println("文件里的内容为："+new String(a,0,length));
    }
    static void getlength(){
        File g=new File("D:"+File.separator+"sentence.txt");
        System.out.println(str.length()+"个字符");
    }
}
