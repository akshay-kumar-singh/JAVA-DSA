import java.util.*;

public class App {

    // O(n^2)
    public static int mountainRanges(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            // i pairs -> mountain ranges => Ci
            for (int j = 0; j < i; j++) {
                int inside = dp[j];
                int outside = dp[i - j - 1];
                dp[i] += inside * outside; // ci = ci * ci-j-1
            }
        }

        // n pairs
        return dp[n];
    }

    public static void main(String[] args) throws Exception {
        int n = 3; // 5
        System.out.println(mountainRanges(n));
    }
}
