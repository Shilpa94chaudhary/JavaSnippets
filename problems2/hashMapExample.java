package problems2;

import java.util.HashMap;
import java.util.Map;

public class hashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Put values in map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);

        // Size of map
        System.out.println("Size of map: " + map.size());
        // Get value for key using get(key) method
        System.out.println("Value for key 'One': " + map.get("One"));

        // Check if map contain key using containsKey(Key) method
        System.out.println("Check if 'Five' is present in map: " + map.containsKey("Five"));
        map.remove("Five");
        System.out.println(
                "Check if 'Five' is present in map, after removing 'Five' from map: " + map.containsValue(5));

        // keySet()
        for (String m : map.keySet()) {
            System.out.println(m);
        }

        // Values
        for (int v : map.values()) {
            System.out.println(v);
        }

        // replace - replcae value for key
        map.replace("Four", 5);
        System.out.println("After replacing value of 'Four' from 4 to 5 " + " " + map.get("Four"));
        map.replace("Four", 4);

        // entrySet()
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        map.clear();
        System.out.println("Size of map after clear " + map.size());
    }
}
