import java.util.*;

class Node {
    int data;
    Node next;
 
    public Node(int data) {
        this.data = data;
        next = null;
    }
}
 
class LinkedList {
    Node head;
 
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
 
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
 
    public void printOddEven() {
        Node even = null, odd = null;
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data % 2 == 0) {
                if (even == null) {
                    even = new Node(currentNode.data);
                } else {
                    even.next = new Node(currentNode.data);
                    even = even.next;
                }
            } else {
                if (odd == null) {
                    odd = new Node(currentNode.data);
                } else {
                    odd.next = new Node(currentNode.data);
                    odd = odd.next;
                }
            }
            currentNode = currentNode.next;
        }
        System.out.print("Even nodes: ");
        if (even == null) {
            System.out.println("None");
        } else {
            printNodes(even);
        }
        System.out.print("Odd nodes: ");
        if (odd == null) {
            System.out.println("None");
        } else {
            printNodes(odd);
        }
    }
 
    private void printNodes(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
 
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.printList();
        list.printOddEven();
    }
}
