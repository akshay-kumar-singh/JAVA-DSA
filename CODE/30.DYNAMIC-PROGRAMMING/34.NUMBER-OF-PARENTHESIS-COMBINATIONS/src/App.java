import java.util.*;

public class App {
    public static void main(String[] args) {
        int n = 4;
        int count = countParenthesisCombinations(n);
        System.out.println(count); // output: 14
    }

    public static int countParenthesisCombinations(int n) {
        if (n == 0) {
            return 1;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            count += countParenthesisCombinations(i) * countParenthesisCombinations(n - 1 - i);
        }

        return count;
    }
}
