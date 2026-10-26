package lecture52;

public class Demo2 {
    public static void main(String[] args) {
        Box box = new Box();

        Thread t1 = new Thread(() -> {
            for(int i=1; i<=20; i++) {
                try {
                    box.producer(i);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1; i<=20; i++) {
                try {
                    box.consumer();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for producer and consumer", e);
        }
    }
}

class Box {
    private Integer item;
    private boolean available;

    synchronized void producer(int value) throws InterruptedException {
        while (available) {
            wait();
        }

        item = value;
        available = true;
        System.out.println("Producer produces " + item);
        notifyAll();
    }

    synchronized void consumer() throws InterruptedException {
        while (!available) {
            wait();
        }

        System.out.println("Consumer consumes " + item);
        item = null;
        available = false;
        notifyAll();
    }
}