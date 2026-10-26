package lecture56;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // try {
        //     executor.execute(() -> {
        //         int x = 10 / 0;
        //     });
        // }
        // catch(Exception e) {
        //     System.out.println("Catched execute exception");
        // }

        try {
            Future<Integer> f1 = executor.submit(() -> 10 / 0);
            System.out.println(f1.get());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for the result", e);
        } catch (java.util.concurrent.ExecutionException e) {
            System.out.println("Caught submit() exception: " + e.getCause());
        } finally {
            executor.shutdown();
        }
    }
}
