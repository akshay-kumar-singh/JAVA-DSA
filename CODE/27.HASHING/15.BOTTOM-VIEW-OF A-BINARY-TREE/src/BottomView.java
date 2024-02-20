import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BottomView {
    Node root;

    public BottomView() {
        root = null;
    }

    // Method that prints the bottom view.
    public void bottomView() {
        if (root == null)
            return;

        int hd = 0;

        // Hash map to store the bottom view.
        Map<Integer, Integer> map = new TreeMap<>();

        // Queue to do BFS traversal.
        Queue<Node> queue = new LinkedList<>();

        // Assign initialized horizontal distance value to root node and add it to the
        // queue.
        root.hd = hd;
        queue.add(root);

        // Loop until the queue is empty (standard level order traversal loop).
        while (!queue.isEmpty()) {
            Node temp = queue.remove();

            // Extract the horizontal distance value from the dequeued tree node.
            hd = temp.hd;

            // Put the dequeued tree node to hash map having key as horizontal distance.
            // For the first time it will add the value to the map, next time it will
            // replace.
            map.put(hd, temp.data);

            // If the dequeued node has a left child, add it to the queue with a horizontal
            // distance hd-1.
            if (temp.left != null) {
                temp.left.hd = hd - 1;
                queue.add(temp.left);
            }

            // If the dequeued node has a right child, add it to the queue with a horizontal
            // distance hd+1.
            if (temp.right != null) {
                temp.right.hd = hd + 1;
                queue.add(temp.right);
            }
        }

        // Traverse the hash map and print the bottom view.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }

    public static void main(String[] args) {
        BottomView tree = new BottomView();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(25);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        System.out.println("Bottom view of the given binary tree :");
        tree.bottomView();
    }
}
