
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadStudentInfo {

    public static void main(String[] args) throws Exception {

        FileInputStream fis=new FileInputStream("e:/data/studinfo.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        System.out.println("Reading a Object.... ");
        Student s=(Student) ois.readObject();
        s.show();
        ois.close();
        fis.close();
    }

}
