package methodOverloading;

public class MethodOverLoadExmpl {

    public void M1() {
        System.out.println("M1 with 0 args...");
    }

    public void M1(int i) {
        System.out.println("M1 with 1 args...");
    }

    public void M1(int i, int j) {
        System.out.println("M1 with 2 args...");
    }

    public int M2(int i, int j) {
        return i+j;
    }

    public void T1(int a, int b){
        System.out.printf("Type Int...");
    }
    public void T1(long a, long b){
        System.out.printf("Type long...");
    }
    public void T1(double a, double b){
        System.out.printf("Type double...");
    }
    public void T2(int a, long b){
        System.out.printf("Type int long...");
    }
    public void T2(long a, int b){
        System.out.printf("Type long int...");
    }
    public static void main(String[] args) {
        MethodOverLoadExmpl obj= new MethodOverLoadExmpl();
        obj.T1(1.0f,3.0f);
        //obj.T2(1,3);
    }
}

