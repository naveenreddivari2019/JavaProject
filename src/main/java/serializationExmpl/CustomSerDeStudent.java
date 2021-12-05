package serializationExmpl;

import java.io.*;

public class CustomSerDeStudent implements Serializable {
    private int age;
    private String name;

    public CustomSerDeStudent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name+" | "+this.age;
    }

    private void writeObject(ObjectOutputStream oos) throws Exception
    {
        System.out.println("enter writeObject method............");
        oos.defaultWriteObject();
        oos.writeObject(name);
        oos.writeObject(age);
    }
    private void readObject(ObjectInputStream ois)throws Exception{
        System.out.println("enter readObject method............");
        ois.defaultReadObject();
        String s1=(String) ois.readObject();
        int ag1=(int)ois.readObject();
        System.out.println(s1+ag1);
    }
}
