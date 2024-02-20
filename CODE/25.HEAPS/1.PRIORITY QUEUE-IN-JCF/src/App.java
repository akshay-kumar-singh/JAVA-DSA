import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3); // o(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); // o(1)
            pq.remove(); // o(logn)
        }
    }
}
