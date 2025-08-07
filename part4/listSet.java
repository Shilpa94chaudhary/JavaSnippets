package part4;

import java.util.*;

public class listSet {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        Set<String> nameSet = new HashSet<>();

        nameList.add("Shilpa");
        nameList.add("Shilpa");
        nameList.add("Poonam");

        nameSet.add("Shilpa");
        nameSet.add("Shilpa");
        nameSet.add("Poonam");

        System.out.println(nameList);
        System.out.println(nameSet);
    }
}
