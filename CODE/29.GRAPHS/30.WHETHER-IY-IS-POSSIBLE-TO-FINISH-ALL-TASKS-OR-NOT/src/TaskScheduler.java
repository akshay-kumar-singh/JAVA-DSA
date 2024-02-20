import java.util.*;

public class TaskScheduler {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Create adjacency list representation of the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];
            graph.get(course).add(prerequisiteCourse);
        }

        // Keep track of courses that have been visited and completed
        boolean[] visited = new boolean[numCourses];
        boolean[] completed = new boolean[numCourses];

        // Perform depth-first search
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (!dfs(graph, visited, completed, i)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean dfs(List<List<Integer>> graph, boolean[] visited, boolean[] completed, int course) {
        visited[course] = true;
        for (int prerequisiteCourse : graph.get(course)) {
            if (!visited[prerequisiteCourse]) {
                if (!dfs(graph, visited, completed, prerequisiteCourse)) {
                    return false;
                }
            } else if (!completed[prerequisiteCourse]) {
                return false;
            }
        }
        completed[course] = true;
        return true;
    }

    public static void main(String[] args) {
        TaskScheduler taskScheduler = new TaskScheduler();
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        boolean result = taskScheduler.canFinish(numCourses, prerequisites);
        System.out.println(result); // Output: false
    }
}

