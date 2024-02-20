import java.util.*;

class KosarajuAlgorithm {
    private int V;
    private LinkedList<Integer>[] adj;

    KosarajuAlgorithm(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void dfs(int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        for (int i : adj[v]) {
            if (!visited[i]) {
                dfs(i, visited, stack);
            }
        }
        stack.push(v);
    }

    void dfsUtil(int v, boolean[] visited, List<Integer> component) {
        visited[v] = true;
        component.add(v);
        for (int i : adj[v]) {
            if (!visited[i]) {
                dfsUtil(i, visited, component);
            }
        }
    }

    List<List<Integer>> getSCCs() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, stack);
            }
        }

        KosarajuAlgorithm graphT = getTranspose();
        visited = new boolean[V];
        List<List<Integer>> sccs = new ArrayList<>();

        while (!stack.isEmpty()) {
            int v = stack.pop();
            if (!visited[v]) {
                List<Integer> component = new ArrayList<>();
                graphT.dfsUtil(v, visited, component);
                sccs.add(component);
            }
        }

        return sccs;
    }

    KosarajuAlgorithm getTranspose() {
        KosarajuAlgorithm g = new KosarajuAlgorithm(V);
        for (int v = 0; v < V; v++) {
            for (int i : adj[v]) {
                g.addEdge(i, v);
            }
        }
        return g;
    }

    public static void main(String[] args) {
        KosarajuAlgorithm g = new KosarajuAlgorithm(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(1, 3);
        g.addEdge(3, 4);

        List<List<Integer>> sccs = g.getSCCs();

        System.out.println("Strongly connected components:");
        for (List<Integer> component : sccs) {
            System.out.println(component);
        }
    }
}

