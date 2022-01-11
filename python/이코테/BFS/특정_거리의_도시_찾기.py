from collections import deque

n, m, k, x = map(int,input().split())

visited = [0] * (n+1)
dis = [0] * (n+1)
graph = [[0] for _ in range(n+1)]

for i in range(m):
    a, b = map(int,input().split())
    graph[a].append(b)

def bfs(start):
    q = deque()
    q.append(start)
    visited[start] = 1

    while q:
        cur = q.popleft()
        for i in range(1,len(graph[cur])):
            if visited[graph[cur][i]] == 0:
                dis[graph[cur][i]] = dis[cur] + 1
                q.append(graph[cur][i])
                visited[graph[cur][i]] = 1

bfs(x)
result = []

for i in range(1, len(dis)):
    if dis[i] == k:
        result.append(i)

if len(result) == 0:
    print(-1)
else:
    for i in result:
        print(i)
        

