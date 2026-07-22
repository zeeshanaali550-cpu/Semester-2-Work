package Week_2;

public class Day2Arrays {
    public static void main(String[] args) {
        
        // Creating an array (fixed size, must declare size or values upfront)
        String[] fruits = {"apple", "banana", "mango", "orange"};
        
        // Accessing elements (index starts at 0)
        System.out.println("First fruit: " + fruits[0]);
        System.out.println("Last fruit: " + fruits[fruits.length - 1]);
        
        // Changing a value
        fruits[1] = "grape";
        System.out.println("After change: " + fruits[1]);
        
        // Array length
        System.out.println("Total fruits: " + fruits.length);
        
        // Looping through an array
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Sorting an array (needs an import)
        int[] numbers = {5, 2, 9, 1, 7};
        java.util.Arrays.sort(numbers);
        System.out.println("Sorted: " + java.util.Arrays.toString(numbers));
    }
}