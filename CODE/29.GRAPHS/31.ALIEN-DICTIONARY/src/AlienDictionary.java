import java.util.*;

public class AlienDictionary {
    public static void main(String[] args) {
        int N = 3;
        int K = 3;
        String[] dict = { "caa", "aaa", "aab" };

        String order = alienOrder(N, K, dict);

        System.out.println(order);
    }

    public static String alienOrder(int N, int K, String[] dict) {
        // Step 1: Create adjacency list and inDegree array
        Map<Character, List<Character>> adjList = new HashMap<>();
        int[] inDegree = new int[K];

        for (int i = 0; i < K; i++) {
            adjList.put((char) ('a' + i), new ArrayList<>());
        }

        // Step 2: Build adjacency list and inDegree array
        for (int i = 0; i < N - 1; i++) {
            String word1 = dict[i];
            String word2 = dict[i + 1];

            int j = 0;
            int len1 = word1.length();
            int len2 = word2.length();

            // Find the first character that is different between the two words
            while (j < len1 && j < len2 && word1.charAt(j) == word2.charAt(j)) {
                j++;
            }

            if (j < len1 && j < len2) {
                char ch1 = word1.charAt(j);
                char ch2 = word2.charAt(j);

                // Add the edge from ch1 to ch2
                adjList.get(ch1).add(ch2);
                inDegree[ch2 - 'a']++;
            }
        }

        // Step 3: Perform topological sort
        StringBuilder sb = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < K; i++) {
            char ch = (char) ('a' + i);

            if (inDegree[i] == 0) {
                queue.add(ch);
            }
        }

        while (!queue.isEmpty()) {
            char ch = queue.poll();
            sb.append(ch);

            for (char neighbor : adjList.get(ch)) {
                inDegree[neighbor - 'a']--;

                if (inDegree[neighbor - 'a'] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        // Step 4: Check if there is a cycle
        if (sb.length() != K) {
            return "";
        }

        return sb.toString();
    }
}
