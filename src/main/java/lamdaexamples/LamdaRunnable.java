package lamdaexamples;

public class LamdaRunnable {
    public static void main(String[] args) {

        Runnable r =() -> {
            System.out.printf("Running....");
        };

        Thread t = new Thread(r);
        t.start();
    }
}
