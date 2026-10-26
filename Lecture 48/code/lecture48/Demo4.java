package lecture48;

public class Demo4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Current thread is " + Thread.currentThread().getName());
        });

        t1.start();
        try {
            t1.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("A thread can only be started once");
        }
        //t1.run();
    }
}

// start() or run()

// Can we start() the same thread twice ? --> NO
