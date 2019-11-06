
import java.io.FileWriter;


public class WriterDemo {
    public static void main(String[] args) throws Exception {

        FileWriter fw=new FileWriter("e:/data/info.txt");
        fw.write("Some data stored using writer",5,20);
        
        fw.close();
        System.out.println("Data Stored");
        
    }
}
