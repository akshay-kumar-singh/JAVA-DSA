import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //insert
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);

        System.out.println(hm);

        //get - o(1)

        // int population = hm.get("india");
        // System.out.println(population);

        // System.out.println(hm.get("indonesia"));

        // //containskey - o(1)
        // System.out.println(hm.containsKey("india")); //true
        // System.out.println(hm.containsKey("indonesia")); //false

        //remove - o(1)
        // System.out.println(hm.remove("indonesia"));
        // System.out.println(hm);

        //size
        System.out.println(hm.size());

        //is empty
        hm.clear();
        System.out.println(hm.isEmpty());
      
    }
}
