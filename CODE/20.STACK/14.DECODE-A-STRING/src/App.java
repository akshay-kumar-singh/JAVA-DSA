import java.util.*;

public class App {
    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                // pop characters until '[' is found
                StringBuilder sb = new StringBuilder();
                while (stack.peek() != '[') {
                    sb.insert(0, stack.pop());
                }
                stack.pop(); // pop '['
                
                // pop digits until non-digit character is found
                StringBuilder numString = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    numString.insert(0, stack.pop());
                }
                
                int num = Integer.parseInt(numString.toString());
                String repeatedString = sb.toString().repeat(num);
                for (char c : repeatedString.toCharArray()) {
                    stack.push(c);
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        String s1 = "2[cv]";
        String s2 = "3[b2[v]]L";
        System.out.println(decodeString(s1)); // output: cvcv
        System.out.println(decodeString(s2)); // output: bvvbvvbvvL
    }
}
