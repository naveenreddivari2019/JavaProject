package ConcurrencyExmpl;

import java.util.concurrent.Semaphore;

public class SemaphoreExmpl {
    public static void main(String[] args) {

        Semaphore sp=new Semaphore(2);

        Runnable r1= new Runnable() {
            @Override
            public void run() {
                System.out.println("R1...."+Thread.currentThread().getName());
                try {
                    sp.acquire();
                    System.out.println("Locking thread : "+Thread.currentThread().getName());
                    System.out.println(sp.availablePermits());
                    sp.release();
                    System.out.println("Releasing thread : "+Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };


        new Thread(r1,"A").start();
        new Thread(r1,"B").start();
        new Thread(r1,"C").start();
        new Thread(r1,"D").start();




    }
}
