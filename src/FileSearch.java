
import java.io.File;
import java.util.Scanner;


public class FileSearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Filename : ");
        String fname=sc.next();
        
        File f=new File(fname);
        boolean res=f.exists();
        if(res){
            System.out.println(fname+" Available");
            boolean res1=f.isFile();
            if(res1==true){
                long val=f.length();
                System.out.println("Its Size : "+val+" bytes");
            }else{
                System.out.println(fname + " is a folder ");
            }
        }else{
            System.out.println(fname + " Not Available");
        }
        
    }
}
