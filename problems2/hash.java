package problems2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("Naveen", 65);
        map.put("Harsh", 83);
        map.put("Shushil", 82);
        map.put("Gaurav", 94);

        // We can replay value by using put method
        map.put("Harsh", 87);

        System.out.println(map);

        for (String name : map.keySet()) {
            System.out.println(name + " " + map.get(name));
        }

        sc.close();
    }
}
