package DFS;

import java.util.Stack;

public class DFS_Stack {
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static boolean[] visited = new boolean[9];

    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        stack.push(1);
        visited[1] = true;

        while(!stack.isEmpty()) {
            int nodeIndex = stack.pop();
            System.out.print(nodeIndex + " --> ");

            for(int LinkedNode : graph[nodeIndex]) {
                if(!visited[LinkedNode]) {
                    stack.push(LinkedNode);
                    visited[LinkedNode] = true;
                }
            }
        }
        System.out.println("end");
    }
}
