package serializationExmpl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomTest {
    public static void main(String[] args) {

        CustomSerDeStudent s1=new CustomSerDeStudent(40,"Naveen");
        try {
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(s1);

            FileInputStream fis =new FileInputStream("student.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            CustomSerDeStudent s2=(CustomSerDeStudent)ois.readObject();
            System.out.println(s2 +" : "+s1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
