import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate frequency of each element in the list
        for (int num : numbers) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        // Find lonely numbers
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Lonely number: " + entry.getKey());
            }
        }
    }
}

