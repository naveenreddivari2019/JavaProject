package methodOverRiding;

public class B extends A{
    public int a=15;
    public B(){
        System.out.println("B Construct...");
    }
    protected  void M1(){
        System.out.println("B M1 called");
    }
    public  void M3(){
        System.out.println("B M3 called");
    }
}
