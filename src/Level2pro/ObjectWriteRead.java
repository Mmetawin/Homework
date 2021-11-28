package Level2pro;

import java.io.*;

public class ObjectWriteRead {
    public void Write(Object heronl[]) throws IOException {
        File f=new File("D:"+File.separator+"Hero.txt");
        OutputStream out=new FileOutputStream(f);
        ObjectOutputStream write=new ObjectOutputStream(out);
        write.writeObject(heronl);
        write.close();
    }
    public  Object[] read() throws IOException, ClassNotFoundException {
        File f=new File("D:"+File.separator+"Hero.txt");
        InputStream input=new FileInputStream(f);
        ObjectInputStream read=new ObjectInputStream(input);
        Object heronl[]=(Object[]) read.readObject();
        read.close();
        return heronl;
    }
}
