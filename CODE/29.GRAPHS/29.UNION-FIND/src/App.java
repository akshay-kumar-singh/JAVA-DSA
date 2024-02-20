import java.util.*;

class Graph {
    int V, E;
    Edge[] edges;

    class Edge {
        int src, dest;
    }

    Graph(int v, int e) {
        V = v;
        E = e;
        edges = new Edge[E];
        for (int i = 0; i < E; i++)
            edges[i] = new Edge();
    }

    int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    void union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    boolean isCycle() {
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        for (int i = 0; i < E; i++) {
            int x = find(parent, edges[i].src);
            int y = find(parent, edges[i].dest);
            if (x == y)
                return true;
            union(parent, x, y);
        }
        return false;
    }
}

public class App {
    public static void main(String[] args) {
        int V = 3, E = 3;
        Graph graph = new Graph(V, E);

        graph.edges[0].src = 0;
        graph.edges[0].dest = 1;

        graph.edges[1].src = 1;
        graph.edges[1].dest = 2;

        graph.edges[2].src = 2;
        graph.edges[2].dest = 0;

        if (graph.isCycle())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph does not contain cycle");
    }
}
