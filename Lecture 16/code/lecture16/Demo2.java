package lecture16;

// Demonstrates fully-qualified names for classes in different packages.
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Import/package example:");
        System.out.println("Use college.Student and school.Student from their own package source files.");
        // The actual package-qualified usage is shown here, and can be enabled when
        // compiled with the sibling package sources:
        // college.Student collegeStudent = new college.Student();
        // collegeStudent.print();
        // school.Student schoolStudent = new school.Student();
        // schoolStudent.print();
    }
}
