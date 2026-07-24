package Week_2;

import java.util.Scanner;

public class Day4ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Basic try-catch
        try {
            System.out.print("Enter a number to deivide 10: ");
            int num = sc.nextInt();
            int result = 10 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
        
        // try-catch-finally
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            System.out.println("You entered: " + age);
        } catch (Exception e) {
            System.out.println("Invalid input, must be a number");
        } finally {
            System.out.println("This always runs, no matter what");
        }
        
        sc.close();
    }
}