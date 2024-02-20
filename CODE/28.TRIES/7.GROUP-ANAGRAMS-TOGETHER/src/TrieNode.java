import java.util.*;

class TrieNode {
    boolean endOfWord;
    HashMap<Character, TrieNode> children;
    List<Integer> indices;

    public TrieNode() {
        endOfWord = false;
        children = new HashMap<>();
        indices = new ArrayList<>();
    }
}

class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word, int index) {
        TrieNode curr = root;
        for (char c : word.toCharArray()) {
            if (!curr.children.containsKey(c)) {
                curr.children.put(c, new TrieNode());
            }
            curr = curr.children.get(c);
        }
        curr.endOfWord = true;
        curr.indices.add(index);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedStr = new String(arr);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(i);
        }
        for (List<Integer> indices : map.values()) {
            List<String> anagrams = new ArrayList<>();
            for (int index : indices) {
                anagrams.add(strs[index]);
            }
            result.add(anagrams);
        }
        return result;
    }
}
