import java.util.*;

public class MotherVertex {

    private static int motherVertex;
    private static boolean[] visited;

    public static int findMotherVertex(int n, List<List<Integer>> graph) {
        visited = new boolean[n];
        motherVertex = -1;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, graph);
                motherVertex = i;
            }
        }
        Arrays.fill(visited, false);
        dfs(motherVertex, graph);
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return -1;
            }
        }
        return motherVertex;
    }

    private static void dfs(int node, List<List<Integer>> graph) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        int n = 7; // number of nodes
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        // add edges to the graph
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(4).add(1);
        graph.get(6).add(4);
        graph.get(5).add(6);
        graph.get(5).add(2);

        int mother = findMotherVertex(n, graph);
        if (mother != -1) {
            System.out.println("The mother vertex is: " + mother);
        } else {
            System.out.println("No mother vertex found.");
        }
    }
}
