public class Day3ArithmeticOperators {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 3;
        
        // Addition
        System.out.println("Addition: " + (a + b));
        
        // Subtraction
        System.out.println("Subtraction: " + (a - b));
        
        // Multiplication
        System.out.println("Multiplication: " + (a * b));
        
        // Division (int/int gives whole number, drops decimal!)
        System.out.println("Division: " + (a / b));
        
        // Division with decimal - cast to double
        System.out.println("Division (decimal): " + ((double) a / b));
        
        // Modulus (remainder after division)
        System.out.println("Modulus: " + (a % b));
        
        // Exponent - Java has no ** operator, must use Math.pow()
        double power = Math.pow(a, 2);   // 10^2 = 100.0
        System.out.println("Exponent: " + power);
    }
}