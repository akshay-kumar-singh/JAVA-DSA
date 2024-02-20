import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); //1
        deque.addFirst(2); //21
        deque.addLast(3); //213
        deque.addLast(4); //2134
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
