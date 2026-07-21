package Week_2;

public class Day1Functions {
    
    // Basic method - no parameters, no return (void)
    static void greet() {
        System.out.println("Hello, welcome to Java methods!");
    }
    
    // Method with parameters
    static void greetUser(String name) {
        System.out.println("Hello, " + name);
    }
    
    // Method with return value
    static int add(int a, int b) {
        return a + b;
    }
    
    // Method calling another method
    static int square(int n) {
        return n * n;
    }
    
    static int sumOfSquares(int a, int b) {
        return square(a) + square(b);
    }
    
    public static void main(String[] args) {
        
        greet();
        greetUser("Ali");
        
        int result = add(5, 3);
        System.out.println("Sum: " + result);
        
        System.out.println("Sum of squares: " + sumOfSquares(2, 3));
    }
}