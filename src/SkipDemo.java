
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SkipDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("e:/data/info.txt");
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
        System.out.println((char)fis.read());
    }
}
