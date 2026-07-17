public class Day4ComparisonOperators {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        
        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true
        System.out.println("a > b: " + (a > b));      // true
        System.out.println("a < b: " + (a < b));      // false
        System.out.println("a >= 10: " + (a >= 10));  // true
        System.out.println("a <= 5: " + (a <= 5));    // false
        
        // Comparing strings - the tricky part
        String name1 = "Ali";
        String name2 = "Ali";
        System.out.println("name1 == name2: " + (name1 == name2));         // true, but unreliable
        System.out.println("name1.equals(name2): " + name1.equals(name2)); // true - correct way
    }
}