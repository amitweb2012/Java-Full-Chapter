package lecture21;

public class Demo {
    public static void main(String[] args) {
        
        MutableCollege college = new MutableCollege("IIT G", "Assam");

        StudentWithMutableCollege s1 = new StudentWithMutableCollege(28, "Aditya", college);

        System.out.println(s1.getMutableCollege().name); // IIT G

        s1.getMutableCollege().name = "IIT B";

        System.out.println(s1.getMutableCollege().name); // IIT B
        

    }
}

// (NOt purely immutable)
final class StudentWithMutableCollege {
    private final int age;
    private final String name;
    private final MutableCollege college;

    StudentWithMutableCollege(int age, String name, MutableCollege college) {
        this.age = age;
        this.name = name;
        this.college = college;
    }

    // getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public MutableCollege getMutableCollege() {
        return this.college;
    }
}

// Mutable
class MutableCollege {
    String name;
    String address;

    MutableCollege(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
