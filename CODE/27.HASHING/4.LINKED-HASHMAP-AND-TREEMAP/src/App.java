import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("india", 100);
        lhm.put("china", 150);
        lhm.put("us", 50);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("india", 100);
        tm.put("china", 150);
        tm.put("us", 50);


        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);

        System.out.println(hm);
        System.out.println(lhm);
        System.out.println(tm);

    }
}
