package lecture56;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo2 {
    public static void main(String[] args) {
        // Furture and Callable

        ExecutorService executor = Executors.newFixedThreadPool(2);

        try {
            Future<Integer> f1 = executor.submit(() -> {
                Thread.sleep(3000);
                return 10;
            });
            System.out.println(f1.get());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for the result", e);
        } catch (java.util.concurrent.ExecutionException e) {
            throw new IllegalStateException("The task failed", e.getCause());
        } finally {
            executor.shutdown();
        }
    }
}
