public class App {

    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};

    public static void floodFill(int[][] grid, int x, int y, int newColor) {
        int oldColor = grid[x][y];
        if (oldColor == newColor) {
            return;
        }
        grid[x][y] = newColor;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == oldColor) {
                floodFill(grid, newX, newY, newColor);
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1}
        };
        int x = 2;
        int y = 2;
        int newColor = 2;
        floodFill(grid, x, y, newColor);
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

