package ConcurrencyExmpl;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExmpl {


    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(2);

        Runnable r1= new Runnable() {
            @Override
            public void run() {
                System.out.println("R1....");
                latch.countDown();
            }
        };
        Runnable r2= new Runnable() {
            @Override
            public void run() {
                System.out.println("R2....");
                latch.countDown();
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
        try {
            System.out.println(latch.getCount());
            latch.await();
            System.out.println(latch.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Remaining code");
    }
}
