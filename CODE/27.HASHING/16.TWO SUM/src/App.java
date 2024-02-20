import java.util.HashMap;

public class App {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each element in the array
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement is already in the HashMap
            if (map.containsKey(complement)) {
                // If it is, return the indices of the current element and its complement
                return new int[] {map.get(complement), i};
            }
            
            // Otherwise, add the current element and its index to the HashMap
            map.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[] {};
    }
}
