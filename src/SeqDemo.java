
import java.io.FileInputStream;
import java.io.SequenceInputStream;


public class SeqDemo {

    public static void main(String[] args) throws Exception {

        FileInputStream fis1=new FileInputStream("e:/data/file1.txt");
        FileInputStream fis2=new FileInputStream("e:/data/file2.txt");
        SequenceInputStream sis=new SequenceInputStream(fis2,fis1);
        while(true){
            int n=sis.read();
            if(n==-1)break;
            System.out.print((char)n);
        }
        
        sis.close();
        fis1.close();
        fis2.close();
        
        
        
        
    }
}
