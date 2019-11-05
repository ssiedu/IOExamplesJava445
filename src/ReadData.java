
import java.io.*;

public class ReadData {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //reading the contents of the file info.txt
        //step-1 (open a stream between file and java prog)
        FileInputStream fis = new FileInputStream("e:/data/info.txt");
        //step-2 (read the data from stream)

        while (true) {

            int n = fis.read();
            if (n == -1) {
                break;
            }
            System.out.print((char)n);

        }
        //step-3 (close the stream)
        fis.close();
    }
}
