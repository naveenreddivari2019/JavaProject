package nestedClassExmpl;

public class Test {

    public static void main(String[] args) {
        MemberNC.Inner obj=new MemberNC().new Inner();
        obj.msg();

        Inf1 o2=new Inf1() {
            @Override
            public void msg() {
                System.out.println("Anonymous Inner Class....");
            }
        };
        o2.msg();

        StaticInner.A o3=new StaticInner.A();
        o3.msg2();
    }
}
