# DFS 예제
graph = {
    1: [2,3,4],
    2: [5],
    3: [5],
    4: [],
    5: [6,7],
    6: [],
    7: [3]
}

# 재귀로 DFS 구현하기
def recursive_dfs(v, visited = []):
    visited.append(v)
    print(v, end=" ")

    for w in graph[v]:
        if w not in visited:
            visited = recursive_dfs(w, visited)
    return visited
print(recursive_dfs(1))


# 스택으로 DFS 구현하기
def iterative_dfs(start_v):
    visited = []
    stack = [start_v]

    while stack:
        v = stack.pop()
        if v not in visited:
            visited.append(v)
            for w in graph[v]:
                stack.append(w)
    return visited
print(iterative_dfs(1))
