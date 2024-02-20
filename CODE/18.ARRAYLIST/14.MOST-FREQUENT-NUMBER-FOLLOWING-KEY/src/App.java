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
        numbers.add(2);
        numbers.add(5);
        numbers.add(2);
        
        int key = 2;
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int i = 0; i < numbers.size() - 1; i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber == key) {
                int nextNumber = numbers.get(i + 1);
                frequencyMap.put(nextNumber, frequencyMap.getOrDefault(nextNumber, 0) + 1);
            }
        }
        
        int maxFrequency = 0;
        int mostFrequentNumber = 0;
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentNumber = entry.getKey();
            }
        }
        
        System.out.println("The most frequent number following " + key + " is " + mostFrequentNumber);
    }
}
