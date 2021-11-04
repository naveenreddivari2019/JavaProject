package interfaceExamples;

public class AImpl implements  A{
    @Override
    public int Sum(int a) {
        return a+i;
    }

    public static void main(String[] args) {
        AImpl obj= new AImpl();
        int res=obj.Sum(3);
        System.out.println("result : "+res);
    }
}
