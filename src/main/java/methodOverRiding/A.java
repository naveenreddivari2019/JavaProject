package methodOverRiding;

public class A {
    public int a=10;
    public  A(){
        System.out.println("A construct...");
    }

    protected  void M1(){
        System.out.println("A M1 called");
    }
    public  void M2(){
        System.out.println("A M2 called");
    }
}
