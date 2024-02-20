import java.util.*;

public class App {

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.equals(".") || component.isEmpty()) {
                // Do nothing, it represents current directory
            } else if (component.equals("..")) {
                // Go up to parent directory
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Add directory to stack
                stack.push(component);
            }
        }

        // Build simplified path from stack
        StringBuilder sb = new StringBuilder("/");
        for (String dir : stack) {
            sb.append(dir).append("/");
        }

        // Remove trailing slash if path is not root
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String path = "/home/foo/../bar/./baz";
        String simplifiedPath = simplifyPath(path);
        System.out.println("Simplified path: " + simplifiedPath);
    }
}
