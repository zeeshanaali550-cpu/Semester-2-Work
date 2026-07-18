public class Day5LogicalOperators {
    public static void main(String[] args) {
        
        int age = 20;
        boolean hasId = true;
        
        System.out.println("age >= 18 && hasId: " + (age >= 18 && hasId));   
        System.out.println("age >= 18 || hasId: " + (age >= 18 || hasId));   
        System.out.println("!hasId: " + (!hasId));                             
        
        // Real-world example
        int age2 = 16;
        boolean hasPermission = true;
        
        if (age2 >= 18 || hasPermission) {
            System.out.println("Allowed to enter");
        } else {
            System.out.println("Not allowed");
        }
    }
}