import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<String> cities = new HashSet<>();

        cities.add("delhi");
        cities.add("mumbai");
        cities.add("noida");
        cities.add("bengaluru");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
