package DFS;

// 탐색알고리즘 : DFS (Depth First Search)
public class DFS_Recursion {
    // 인접 리스트 표현
    // 1번 노드와 연결된 노드 : 2, 3, 8
    // 2번 노드와 연결된 노드 : 1. 6, 8
    // 3번 노드와 연결된 노드 : 1, 5
    //  ...
    // 8번 노드와 연결된 노드 : 1, 2
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    static boolean[] visited = new boolean[9];


    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true;
        System.out.print(nodeIndex + " --> ");
        for(int node : graph[nodeIndex]) { // 자바 foreach
            if(!visited[node]) {
                dfs(node);
            }
        }
    }


    public static void main(String[] args) {
       dfs(1);
        System.out.println("end");
    }

}
