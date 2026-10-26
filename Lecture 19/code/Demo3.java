// Local classes

public class Demo3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
}

// Effective final variable

class Outer {
    void greet() {
        int y = 5;
        final int valueToCapture = ++y;

        class Local {
            void sayHello() {
                System.out.println(valueToCapture);
            }
        }

        Local local  = new Local();
        local.sayHello();
    }
}

/*
Contructor
Method
If
Loop
Static block
*/
