import java.util.*;

public class ClosedIslands {
    
    public static int closedIslandCount(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int count = 0;
        
        // Loop through each cell of the matrix
        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                // If the cell is land and is not already visited
                if (mat[i][j] == 1) {
                    if (isClosed(mat, i, j)) {
                        // Increment the count of closed islands
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    // Check if the island is closed
    public static boolean isClosed(int[][] mat, int i, int j) {
        // If the cell is water or is already visited
        if (mat[i][j] == 0 || mat[i][j] == -1) {
            return false;
        }
        // Mark the cell as visited
        mat[i][j] = -1;
        // Check if the island is closed in all four directions
        boolean up = isClosed(mat, i - 1, j);
        boolean down = isClosed(mat, i + 1, j);
        boolean left = isClosed(mat, i, j - 1);
        boolean right = isClosed(mat, i, j + 1);
        return up && down && left && right;
    }
    
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0, 0, 0, 0, 0, 1},
                       {0, 1, 1, 1, 1, 0, 0, 1},
                       {0, 1, 0, 1, 0, 0, 0, 1},
                       {0, 1, 1, 1, 1, 0, 1, 0},
                       {0, 0, 0, 0, 0, 0, 0, 1}};
        System.out.println(closedIslandCount(mat)); // Output: 2
    }
}

