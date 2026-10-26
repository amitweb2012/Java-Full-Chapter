public class Demo {
    public static void main(String[] args) {
        // Jump statements and labelled loops.
        outer: for (int i = 1; i <= 10; i++) {
            inner: for (int j = 1; j <= i; j++) {
                System.out.print("* ");

                if (j >= 5) {
                    break outer;
                }
            }
            System.out.println();
        }

        // Other loop examples are retained as comments in the lesson notes.
    }
}
