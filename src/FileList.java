
import java.io.File;
import java.util.Scanner;

public class FileList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Folder Name : ");
        String name = sc.next();
        File f = new File(name);
        String s[] = f.list();

        if (f.exists()) {
            if (f.isDirectory()) {
                for (String tmp : s) {
                    System.out.println(tmp);
                }
            } else {
                System.out.println("Not A Folder");
            }
        } else {
            System.out.println("Doesnt Exists");
        }

    }
}
