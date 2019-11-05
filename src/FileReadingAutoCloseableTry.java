
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingAutoCloseableTry {

    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("e:/data/trial.txt")) {
            while (true) {
                int n = fis.read();
                if (n == -1) {
                    break;
                }
                System.out.print((char) n);
            }
        }

        System.out.println();

        System.out.println("Now Deleting File : ");
        File f = new File("e:/data/trial.txt");
        boolean res = f.delete();
        if (res) {
            System.out.println("FILE DELETED ");
        } else {
            System.out.println("CANT DELETE FILE");
        }

    }
}
