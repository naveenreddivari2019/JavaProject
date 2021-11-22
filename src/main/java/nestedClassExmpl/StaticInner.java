package nestedClassExmpl;

public class StaticInner {

    private int i=10;
    private static int j=20;
    public static class A{
         public  static void msg2(){
            System.out.println(j);
        }
    }
}
