package objectHashEqualsOverride;

public class Test {
    public static void main(String[] args) {

        Student o1=new Student();
        o1.setId(01);o1.setName("Naveen");

        Student o2=new Student();
        o2.setId(01);o2.setName("Naveen1");

        System.out.println(o1.equals(o2));

        System.out.println(o1 +" | "+o2);
    }
}
