
import java.io.File;
import java.util.Date;


public class FileInfo {
    public static void main(String args[]){
        
        File f=new File("e:/data/info.txt");
        //boolean res=f.isHidden();
        //boolean res=f.canWrite();
        long res=f.lastModified();
        Date dt=new Date(res);
        
        System.out.println(res);
        System.out.println(dt);
    }
}
