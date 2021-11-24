package cloningExmpl;

public class ShallowCloning implements  Cloneable{

    private int age;
    private String name;

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

    public ShallowCloning(){
        System.out.println("Default Construct....");
    }

    @Override
    public String toString() {
        return this.name+" | "+this.age;
    }

    public ShallowCloning(int age, String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Object Clone() throws CloneNotSupportedException{
        return super.clone();
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        ShallowCloning obj1=new ShallowCloning(23,"Naveen");
        ShallowCloning obj2= null;
        try {
            obj2 = (ShallowCloning) obj1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("obj1 : "+obj1+"  obj2: "+obj2);
        obj1.setAge(40);
        System.out.println(" Equals Cond : "+obj1.equals(obj2));
        obj2.setAge(35);
        System.out.println("obj1 : "+obj1+"  obj2: "+obj2);
    }
}
