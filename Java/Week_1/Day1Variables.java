public class Day1Variables {
    public static void main(String[] args) {
        
        // Primitive data types
        int age = 19;
        double gpa = 3.75;
        char grade = 'A';
        boolean isEnrolled = true;
        
        // Non-primitive type
        String name = "Ali";
        
        // Printing variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Enrolled: " + isEnrolled);
        
        System.out.println("---- Data Types ----");
        System.out.println("age is int, gpa is float, grade is char and inEnrolled is boolean. (primitive)");
        System.out.println("name is of type: " + name.getClass().getSimpleName() + " (non-primitive)");
    }
}