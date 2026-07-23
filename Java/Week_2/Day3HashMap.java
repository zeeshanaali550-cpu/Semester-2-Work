package Week_2;

import java.util.HashMap;

public class Day3HashMap {
    public static void main(String[] args) {
        
        // Creating a HashMap (key-value pairs)
        HashMap<String, String> student = new HashMap<>();
        student.put("name", "Ali");
        student.put("age", "20");
        student.put("course", "Computer Science");
        
        System.out.println(student);
        
        // Accessing values by key
        System.out.println("Name: " + student.get("name"));
        
        // Updating / adding a value
        student.put("age", "21");        // update
        student.put("gpa", "3.8");        // add new
        System.out.println("Updated: " + student);
        
        // Removing a key
        student.remove("course");
        System.out.println("After delete: " + student);
        
        // Looping through a HashMap
        for (String key : student.keySet()) {
            System.out.println(key + " : " + student.get(key));
        }
        
        // Checking if a key exists
        System.out.println("Has 'name'? " + student.containsKey("name"));
    }
}