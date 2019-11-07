
import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class DataOutputDemo {
    public static void main(String[] args) throws Exception {

        int eno=1001;
        double sal=50050.60;
        boolean permanent=true;
        
        FileOutputStream fos=new FileOutputStream("e:/data/empinfo.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(eno); 
        dos.writeDouble(sal);
        dos.writeBoolean(permanent);
        
        dos.close();
        fos.close();
        
        System.out.println("Data Stored");
        
    }
}
