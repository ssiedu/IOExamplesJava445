
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class WriteStudentInfo {

    public static void main(String[] args) throws Exception {

        Student stud=new Student(111, "ABC", "CS", 3);
        stud.show();
        System.out.println("Saving Object State ... ");
        FileOutputStream fos=new FileOutputStream("e:/data/studinfo.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(stud);
        oos.close();
        fos.close();
        System.out.println("Object Stored Successfully");
    }
}
