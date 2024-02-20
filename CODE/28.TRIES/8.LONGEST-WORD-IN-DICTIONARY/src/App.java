public class App {
    static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }

    static TrieNode root;

    public String longestWord(String[] words) {
        root = new TrieNode();
        for (String word : words) {
            insert(word);
        }

        String result = "";
        for (String word : words) {
            if (search(word)) {
                if (word.length() > result.length() || (word.length() == result.length() && word.compareTo(result) < 0)) {
                    result = word;
                }
            }
        }

        return result;
    }

    private static void insert(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new TrieNode();
            }
            curr = curr.children[c - 'a'];
        }
        curr.isEndOfWord = true;
    }

    private static boolean search(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (curr.children[c - 'a'] == null || !curr.children[c - 'a'].isEndOfWord) {
                return false;
            }
            curr = curr.children[c - 'a'];
        }
        return true;
    }
}
