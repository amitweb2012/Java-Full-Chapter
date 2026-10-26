package lecture15;

// Use of String[] args

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Number of arguments are " + args.length);

        for(int i=0; i<args.length; i++) {
            System.out.println("Argument " + i + " = " + args[i]);
        }

        //java Demo3 input.txt output.txt
        //java Demo3 
    }
}
