package remind;
import java.util.Stack;

public class DFS {
    static int[][] map = {
            {},
            {2, 3}, // 1번노드와 연결된 노드의 정보
            {4, 5}, // 2번노드와 연결된 노드의 정보
            {1, 6}, // 3
            {2, 7, 8}, // 4
            {2, 8}, // 5
            {3, 9}, // 6
            {4}, // 7
            {4, 5}, // 8
            {6} // 9
    };
    static boolean[] visited = new boolean[10];

    // 이렇게 작성하면 방문처리된 노드를 한번 더 실행해서 판단하게 된다.
    static void recursive_dfs(int i) { // 매개변수 : 시작 노드 번호
        if (!visited[i]) {
            visited[i] = true;
            System.out.print(i + " --> ");
            for (int node : map[i]) {
                recursive_dfs(node);
            }
        }
    }

    // 실행하기전에 방문처리를 확인하여 거른다.
    static void recursive_dfs_solution(int i) {
        visited[i] = true; // 입력된 값을 바로 방문처리
        System.out.println(i + " "); // 방문처리 후 출력
        for(int node : map[i]) { // 방문노드에서 forEach
            if(!visited[node]) { // 방문한적이없는 노드만 실행
                recursive_dfs_solution(node);
            }
        }
    }


    static Stack<Integer> st = new Stack<>();

    // isEmpty() : 스택이 비었는지 확인
    // empty() : 스택을 초기화
    static void stack_dfs(int i) {
        st.push(i);
        visited[i] = true; // 처음 매개변수로 입력된 노드를 방문처리

        while (!st.isEmpty()) { // 스택이 빌때까지 무한루프
            int tmp = st.pop(); // 스택 가장위의 노드를 빼낸다
            System.out.print(tmp + " --> "); // 출력
            for (int node : map[tmp]) { // 해당 노드와 연결된 노드들을 탐색
                if (!visited[node]) { // 방문된적없는 노드를 집어넣고 방문처리
                    st.push(node);
                    visited[node] = true;
                }
            }
        }


    }


    public static void main(String[] args) {
//        recursive_dfs(1);
        stack_dfs(1);
    }
}
