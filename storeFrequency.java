import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class storeFrequency {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2));

        System.out.println("Before: " + list);

        Map<Integer, Integer> map = new HashMap<>();

        for (int x : list) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println("Frequency Map:");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

/*
 * Loop: n elements
 * Har operation: HashMap put → O(1) average
 * Total: O(n)
 * Space: O(n)
 * 
 */
