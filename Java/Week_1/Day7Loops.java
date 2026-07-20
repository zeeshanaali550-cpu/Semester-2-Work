public class Day7Loops {
    public static void main(String[] args) {
        
        // for loop - repeats a fixed number of times
        System.out.println("--- For Loop ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // while loop
        System.out.println("--- While Loop ---");
        int count = 0;
        while (count < 5) {
            System.out.println("While count: " + count);
            count++;   // must update, or infinite loop!
        }
        
        // loop through an array
        System.out.println("--- Loop through array ---");
        String[] fruits = {"apple", "banana", "mango"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // break and continue
        System.out.println("--- Break and Continue ---");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Break demo: " + i);
        }
        
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Continue demo: " + i);
        }
    }
}