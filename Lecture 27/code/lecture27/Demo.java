package lecture27;

public class Demo {
    public static void main(String[] args) {
        // Upcasting
        String s = "Hello";
        Object obj = s;

        //System.out.println(obj);

        // Downcasting
        Object obj2 = "Aditya";
        String s2 = (String) obj2;

        System.out.println(s2);

        Object obj3 = 10;
        try {
            String s3 = (String) obj3;
            System.out.println(s3);
        } catch (ClassCastException e) {
            System.out.println("Cannot cast an Integer to a String");
        }
    }
}
