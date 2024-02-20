import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<String> cities = new HashSet<>();

        cities.add("delhi");
        cities.add("mumbai");
        cities.add("noida");
        cities.add("bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
    
        lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("noida");
        lhs.add("bengaluru");
        System.out.println(lhs);

        // lhs.remove("delhi");
        // System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();  //alphabetical
        ts.add("delhi");
        ts.add("mumbai");
        ts.add("noida");
        ts.add("bengaluru");
        System.out.println(ts);
    }
}
