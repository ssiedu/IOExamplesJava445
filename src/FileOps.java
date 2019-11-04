import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileOps {

    public static void main(String[] args) throws IOException {
        
        File f=new File("e:/data/Temp.java");
        boolean res=f.createNewFile();
        /*
        File f=new File("e:/data/myfile.txt");
        //boolean res=f.mkdir();
        boolean res=f.delete();
        */
        /*
        File f1=new File("e:/data1/trial.txt");
        File f2=new File("e:/data/trial.txt");
        boolean res=f1.renameTo(f2);
        */
        if(res){
            System.out.println("Operation Success");
        }else{
            System.out.println("Operation Failed");
        }
        
    }
}
