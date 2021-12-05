package serializationExmpl;

import java.io.*;

public class SerializationImpl {

    public static void main(String[] args) {

        Student s1= new Student(25,"Naveen");
        FileOutputStream fos;

        {
            try {
                fos = new FileOutputStream("student.txt");
                ObjectOutputStream oos= new ObjectOutputStream(fos);
                oos.writeObject(s1);

                FileInputStream fis =new FileInputStream("student.txt");
                ObjectInputStream ois=new ObjectInputStream(fis);
                Student s2=(Student)ois.readObject();
                System.out.println(s2 +" : "+s1);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
