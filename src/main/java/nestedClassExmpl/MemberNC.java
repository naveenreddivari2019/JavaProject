package nestedClassExmpl;

public class MemberNC {

    private int data =10;

    public class Inner{
        public void msg(){
            System.out.println("Data : "+data);
        }
    }
}
