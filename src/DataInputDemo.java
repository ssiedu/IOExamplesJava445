
import java.io.DataInputStream;
import java.io.FileInputStream;


public class DataInputDemo {

    public static void main(String[] args) throws Exception {
        
        FileInputStream fis=new FileInputStream("e:/data/empinfo.txt");
        DataInputStream dis=new DataInputStream(fis);
        int v1=dis.readInt();
        double v2=dis.readDouble();
        boolean v3=dis.readBoolean();
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        dis.close();
        fis.close();
        fis.close();
            
        
    }
}
