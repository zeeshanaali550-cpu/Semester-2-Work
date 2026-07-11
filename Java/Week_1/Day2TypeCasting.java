public class Day2TypeCasting {
    public static void main(String[] args) {
        
        // Implicit casting (automatic) - int to double
        int num = 10;
        double numDouble = num;
        System.out.println("Implicit cast: " + numDouble);
        
        // Explicit casting (manual) - double to int
        double price = 99.99;
        int roundedDown = (int) price;
        System.out.println("Explicit cast: " + roundedDown);  // 99, not 100 - it truncates, doesn't round
        
        // String to int
        String numStr = "25";
        int numFromStr = Integer.parseInt(numStr);
        System.out.println("String to int: " + (numFromStr + 5));
        
        // int to String
        int score = 90;
        String scoreStr = String.valueOf(score);
        System.out.println("Score: " + scoreStr);
    }
}