package cloningExmpl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeepCloning {

    public static void main(String[] args) {
        Address a1= new Address();
        a1.setCity("HYD");

        Student s1= new Student();
        s1.setName("Naveen");
        s1.setAddr(a1);

        Student s2=deepClone(s1);

        System.out.println(s1 + " : "+s2);

        s1.setName("Babji");

        s2.setName("Kiran");
        System.out.println(s1 + " : "+s2);

    }
    public static Student deepClone(Student object){
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            ByteArrayInputStream bais = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(bais);
            return (Student) objectInputStream.readObject();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
