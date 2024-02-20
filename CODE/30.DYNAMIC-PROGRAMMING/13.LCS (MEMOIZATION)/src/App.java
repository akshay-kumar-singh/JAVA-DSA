import java.util.Arrays;

public class App {
    
    public static int[][] memo;
    
    public static int findLCS(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        memo = new int[n+1][m+1];
        for(int[] row: memo)
            Arrays.fill(row, -1);
        return lcs(s1, s2, n, m);
    }
    
    public static int lcs(String s1, String s2, int n, int m) {
        if(n == 0 || m == 0)
            return 0;
        if(memo[n][m] != -1)
            return memo[n][m];
        if(s1.charAt(n-1) == s2.charAt(m-1))
            memo[n][m] = 1 + lcs(s1, s2, n-1, m-1);
        else
            memo[n][m] = Math.max(lcs(s1, s2, n, m-1), lcs(s1, s2, n-1, m));
        return memo[n][m];
    }
    
    public static void main(String[] args) {
        String s1 = "abcdge";
        String s2 = "abedg";
        System.out.println("Length of LCS is " + findLCS(s1, s2));
    }
}

