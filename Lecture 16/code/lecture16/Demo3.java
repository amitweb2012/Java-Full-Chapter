package lecture16;

public class Demo3 {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendance();
        es.attendLab();

        Student s1 = new Student();
        s1.markAttendance();
       // s1.attendLab(); (wrong)
    }

    /*
    parent (Superclass) --> child (subclass)
    */
    static class Student {
        String name;
        int age;

        public void markAttendance() {
            System.out.println("Attendance marked");
        }
    }

    static class EngineeringStudent extends Student {
        void attendLab() {
            System.out.println("lab attended");
        }

        @Override
        public void markAttendance() {
            System.out.println("Attendance marked by engineering student");
        }
    }
}