package java8Features;

public class FunctionalAddImpl {

    public static void main(String[] args) {
        FunctionalAdd fa = (int x, int y) -> {
            return x + y;
        };
        int rs = fa.add(5, 5);
        System.out.println("Result : " + rs);

        FunctionalAdd fmr= FunctionalAdd::sum;
        System.out.println(fmr.add(4,5));
    }
}
