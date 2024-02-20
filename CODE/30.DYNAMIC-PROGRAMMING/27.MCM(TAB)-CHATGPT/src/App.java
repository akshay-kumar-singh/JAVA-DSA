public class App {

    public static int matrixChainOrder(int[] p) {
        int n = p.length - 1; // number of matrices

        int[][] dp = new int[n][n];

        for (int l = 2; l <= n; l++) {
            for (int i = 0; i <= n - l; i++) {
                int j = i + l - 1;
                dp[i][j] = Integer.MAX_VALUE;

                // k is the index of the matrix that we are splitting the chain at
                for (int k = i; k < j; k++) {
                    int q = dp[i][k] + dp[k + 1][j] + p[i] * p[k + 1] * p[j + 1];
                    if (q < dp[i][j]) {
                        dp[i][j] = q;
                    }
                }
            }
        }

        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        int[] p = { 1, 2, 3, 4, 3 }; 
        int minMultiplications = matrixChainOrder(p);
        System.out.println(minMultiplications);
    }
}
