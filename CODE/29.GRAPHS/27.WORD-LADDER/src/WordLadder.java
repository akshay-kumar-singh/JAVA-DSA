import java.util.*;

public class WordLadder {

    public int ladderLength(String start, String target, Set<String> dictionary) {
        // Check if both words are of the same length
        if (start.length() != target.length()) {
            return 0;
        }
        
        // Create a visited set to keep track of visited words
        Set<String> visited = new HashSet<>();
        visited.add(start);
        
        // Create a queue to perform BFS
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        
        // Initialize ladder length to 1
        int ladderLength = 1;
        
        // Perform BFS
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                // Check if current word is the target word
                if (current.equals(target)) {
                    return ladderLength;
                }
                // Generate all possible one-letter different words from the current word
                for (int j = 0; j < current.length(); j++) {
                    char[] chars = current.toCharArray();
                    for (char c = 'A'; c <= 'Z'; c++) {
                        chars[j] = c;
                        String nextWord = new String(chars);
                        if (dictionary.contains(nextWord) && !visited.contains(nextWord)) {
                            visited.add(nextWord);
                            queue.offer(nextWord);
                        }
                    }
                }
            }
            ladderLength++;
        }
        
        // If the target word is not found, return 0
        return 0;
    }
    
    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>(Arrays.asList("POON", "PLEE", "SAME", "POIE", "PLEA", "PLIE", "POIN"));
        String start = "TOON";
        String target = "PLEA";
        WordLadder wl = new WordLadder();
        int ladderLength = wl.ladderLength(start, target, dictionary);
        System.out.println(ladderLength);
    }
}

