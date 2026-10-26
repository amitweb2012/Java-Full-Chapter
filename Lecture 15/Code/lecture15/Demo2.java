package lecture15;

// Final Keyword

public class Demo2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x;
        x = 4;
        System.out.println(x);
    }
}

//why main is static in java ??
// Demo2 d1 = new Demo2();
// d1.main()
// Demo2.main()

class Random {
    static final double PI;

    static {
        PI = 3.14;
    }
}
