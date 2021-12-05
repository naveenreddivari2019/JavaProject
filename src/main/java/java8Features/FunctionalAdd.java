package java8Features;

@FunctionalInterface
public interface FunctionalAdd {
    public int add(int x, int y);

    public static int sum(int a, int b) {
        System.out.println("Calling sum method...");
        return a + b;
    }
}
