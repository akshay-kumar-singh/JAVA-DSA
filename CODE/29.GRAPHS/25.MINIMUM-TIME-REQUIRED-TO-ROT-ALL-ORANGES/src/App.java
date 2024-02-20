import java.util.*;

public class App {
    
    static class Pair {
        int x;
        int y;
        
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int freshOranges = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshOranges++;
                } else if (grid[i][j] == 2) {
                    queue.add(new Pair(i, j));
                }
            }
        }
        int minutes = 0;
        int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        while (!queue.isEmpty() && freshOranges > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair curr = queue.poll();
                for (int[] dir : directions) {
                    int x = curr.x + dir[0];
                    int y = curr.y + dir[1];
                    if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0 || grid[x][y] == 2) {
                        continue;
                    }
                    grid[x][y] = 2;
                    freshOranges--;
                    queue.add(new Pair(x, y));
                }
            }
            minutes++;
        }
        return freshOranges == 0 ? minutes : -1;
    }
    
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 0, 2, 1}, {0, 0, 1, 2, 1}, {1, 0, 0, 2, 1}};
        int result = orangesRotting(grid);
        if (result == -1) {
            System.out.println("All oranges cannot be rotten.");
        } else {
            System.out.println("Minimum time required to rot all oranges: " + result);
        }
    }
}

