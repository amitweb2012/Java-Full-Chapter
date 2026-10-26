// Demonstrates using fully-qualified class names to distinguish packages.
// Compile together with the sibling college/Student.java and school/Student.java files.
public class Demo2 {
    public static void main(String[] args) {
        college.Student collegeStudent = new college.Student();
        collegeStudent.print();

        school.Student schoolStudent = new school.Student();
        schoolStudent.print();
    }
}
