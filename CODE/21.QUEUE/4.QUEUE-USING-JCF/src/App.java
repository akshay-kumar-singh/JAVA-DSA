import java.util.*;;

public class App {

    public static void main(String[] args) throws Exception {
        // queue q = new queue();
        Queue<Integer> q = new LinkedList<>(); // arraydeque
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
