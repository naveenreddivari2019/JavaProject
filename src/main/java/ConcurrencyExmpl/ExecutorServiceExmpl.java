package ConcurrencyExmpl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExmpl {
    public void M1(ExecutorService ex ) throws InterruptedException, ExecutionException {
        //ExecutorService ex = Executors.newFixedThreadPool(10);
        List<Callable<String>> l = new ArrayList<>();
        l.add(
                () -> {
                    return "Task 1 "+Thread.currentThread().getName();
                }
        );
        l.add(
                () -> {
                    return "Task 2 "+Thread.currentThread().getName();
                }
        );
        l.add(
                () -> {
                    return "Task 3 "+Thread.currentThread().getName();
                }
        );
        List<Future<String>> result = ex.invokeAll(l);
        result.forEach(
                (e) -> {
                    try {
                        System.out.println(e.get());
                    } catch (InterruptedException exc) {
                        exc.printStackTrace();
                    } catch (ExecutionException exc) {
                        exc.printStackTrace();
                    }
                }
        );

        Future<String> t1 = ex.submit(
                () -> {
                    return "submit Task 1 "+Thread.currentThread().getName();
                }
        );

        Future<String> t2 = ex.submit(
                () -> {
                    return "submit Task 2 "+Thread.currentThread().getName();
                }
        );
        Future<String> t3 = ex.submit(
                () -> {
                    return " submit Task 3 "+Thread.currentThread().getName();
                }
        );
        System.out.println(t1.get() + " | " + t2.get() + " | " + t3.get());

        //ex.shutdown();
    }

    public static void main(String[] args)  {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ExecutorServiceExmpl obj=new ExecutorServiceExmpl();
        try {
            obj.M1(ex);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            ex.shutdown();
            System.out.println("executed finally task.....");
        }
    }

}
