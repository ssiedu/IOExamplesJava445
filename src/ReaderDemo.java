
import java.io.FileReader;

public class ReaderDemo {
    public static void main(String[] args) throws Exception {

        FileReader fr=new FileReader("e:/data/info.txt");
        
        char ch[]=new char[20];
        fr.read(ch);
        for(char c:ch)
            System.out.print(c);
        
        fr.close();
    }
}
