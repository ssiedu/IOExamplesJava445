import java.io.File;
import java.util.Scanner;


public class FileOps {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Folder Name : ");
        String name=sc.next();
        File f=new File("e:/data/"+name);
        f.mkdir();
        System.out.println("Folder Created");
        
    }
}
