package lecture19;

// Inner class

public class Demo2 {
    public static void main(String[] args) {

        InnerClassOuter outer = new InnerClassOuter();
        
        //InnerClassOuter.Inner inner = new InnerClassOuter.Inner();

        InnerClassOuter.Inner inner = outer.new Inner();

       // InnerClassOuter.Inner inner = new InnerClassOuter().new Inner();

        inner.fun();
        inner.fun2();
        InnerClassOuter.Inner.fun2();
    }
}

class InnerClassOuter {

    int x = 10;

    class Inner {
        //int x = 20;

        //Outer outer;

        static int x = 10;

        void fun() {
            System.out.println(x);
            //System.out.println(Outer.this.x);
        }

        static void fun2() {
            System.out.println("Hello");
        }
    }
}
