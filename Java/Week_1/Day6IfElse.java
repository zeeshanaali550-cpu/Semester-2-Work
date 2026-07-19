public class Day6IfElse {
    public static void main(String[] args) {
        
        // Basic if-else
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
        
        // if-else if-else (multiple conditions)
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // Nested if (if inside another if)
        int temperature = 30;
        boolean isRaining = false;
        
        if (temperature > 25) {
            if (!isRaining) {
                System.out.println("Hot and dry - go swimming");
            } else {
                System.out.println("Hot but raining - stay inside");
            }
        } else {
            System.out.println("Not hot enough for swimming");
        }
        
        // Combining logical operators with if-else
        int age2 = 16;
        boolean hasPermission = true;
        
        if (age2 >= 18 || hasPermission) {
            System.out.println("Allowed to enter");
        } else {
            System.out.println("Not allowed");
        }
    }
}