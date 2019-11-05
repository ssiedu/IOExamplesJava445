
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadTwo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //FileInputStream fis = new FileInputStream("e:/data/info.txt");
        FileInputStream fis = new FileInputStream("e:/java4/Demo.java");

        //creating an array of byte datatype
        int size=fis.available();
        byte b[]=new byte[size];
        //reading the data from stream and storing to array
        fis.read(b);
        //converting array to a string\
        System.out.println("SIZE : "+size);
        String s=new String(b);
        System.out.println(s);
        
        fis.close();
    }
}
