public class App {

    static class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    static void mirror(Node node) {
        if (node == null)
            return;
        else {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;

            mirror(node.left);
            mirror(node.right);
        }
    }

    static void inorderTraversal(Node node) {
        if (node == null)
            return;

        inorderTraversal(node.left);
        System.out.print(node.value + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Original tree:");
        inorderTraversal(root);

        mirror(root);

        System.out.println("\nMirrored tree:");
        inorderTraversal(root);
    }
}
