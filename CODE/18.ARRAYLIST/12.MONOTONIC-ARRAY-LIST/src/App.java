import java.util.ArrayList;

public class App {
   

    public static boolean isMonotonic(ArrayList<Integer> arr) {
        if (arr.size() <= 2) {
            return true;
        }

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i-1)) {
                increasing = false;
            }
            if (arr.get(i) > arr.get(i-1)) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(isMonotonic(arr));
    }
}

