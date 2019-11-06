
import java.io.FileOutputStream;


public class WriteData {

    public static void main(String[] args) throws Exception {

        //to write something to a file.
        
        //step-1 (open the stream)
        FileOutputStream fos=new FileOutputStream("e:/data/sample.txt");
        //FileOutputStream fos=new FileOutputStream("e:/data/sample.txt", true);
        //step-2 (write the data on stream)
        //fos.write(65);fos.write(66); fos.write(67);
        
        byte b[]={97,98,99,100,101,102,103,104,105,106};
        fos.write(b);
        //step-3 (close the stream)
        fos.close();
        System.out.println("DATA STORED");
        
    }
}
