import java.util.*;

public class CycleDetection {

    private int V; // number of vertices
    private LinkedList<Integer>[] adjList; // adjacency list

    public CycleDetection(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u);
    }

    public boolean isCyclic() {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfs(i, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean bfs(int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adjList[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                    parent[v] = u;
                } else if (parent[u] != v) {
                    // If an adjacent vertex v is already visited and not the parent of the current
                    // vertex u,
                    // then there is a cycle in the graph.
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDetection graph = new CycleDetection(5);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);

        if (graph.isCyclic()) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph doesn't contain cycle");
        }
    }
}
