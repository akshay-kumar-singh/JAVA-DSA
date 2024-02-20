import java.util.*;

public class App {

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            tail.next = node;
            tail = node;

            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Sample input 1
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(7);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(8);

        ListNode list3 = new ListNode(9);
        list3.next = new ListNode(10);
        list3.next.next = new ListNode(11);

        ListNode[] lists = new ListNode[] { list1, list2, list3 };

        // Merge K sorted lists
        ListNode mergedList = mergeKLists(lists);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + "->");
            mergedList = mergedList.next;
        }
        System.out.print("NULL");
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
