package nab;

import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Aman", 67);
        students.put("Arun", 81);
        students.put("Harsh", 79);

        System.out.println(students);

        // Get value for specific Key
        int marks = students.get("Aman");
        System.out.println(marks);

        // Keys are unique
        students.put("Harsh", 81);
        System.out.println(students);

        // Get all the Keys in Map
        System.out.println(students.keySet());

        // Print Key-Value in Map
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }

    }
}
