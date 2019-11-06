
import java.io.FileOutputStream;
import java.util.Scanner;


public class WriteInfo {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name  : ");
        String name=sc.next();
        byte b[]=name.getBytes();
        FileOutputStream fos=new FileOutputStream("e:/data/names.txt",true);
        //fos.write(b);
        fos.write(b, b.length-3, 3);
        fos.close();
        System.out.println("Name Stored To File ");
        
    }
}
