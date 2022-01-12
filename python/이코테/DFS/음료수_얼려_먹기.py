n, m = map(int,input().split(" "))
graph = [list(map(int, input())) for _ in range(n)]

dx = [1,0,-1,0]
dy = [0,1,0,-1]

def dfs(x,y):
    graph[x][y] = 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx and nx < n and 0 <= ny and ny < m and graph[nx][ny] == 0:
            dfs(nx,ny)

count = 0
for i in range(n):
    for j in range(m):
        if graph[i][j] == 0:
            dfs(i,j)
            count+=1
print(count)



