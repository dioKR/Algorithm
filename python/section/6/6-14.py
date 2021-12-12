# 토마토
import sys
sys.stdin = open("6-14.txt", "r")
from collections import deque

m, n = map(int,input().split())
graph = [list(map(int,input().split())) for _ in range(n)]
q = deque()
res = -2147000000
dx = [1,0,-1,0]
dy = [0,1,0,-1]


for i in range(n):
    for j in range(m):
        if graph[i][j] == 1:
            q.append((i,j))

while q:
    cur = q.popleft()
    x = cur[0]
    y = cur[1]
    
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 0:
            q.append((nx,ny))
            graph[nx][ny] = graph[x][y] + 1
            if graph[nx][ny] > res:
                res = graph[nx][ny]

# 뒷 부분의 처리방식을 집중적으로 들어야함
for i in range(n):
    for j in range(m):
        if graph[i][j] == 0:
            print(-1)
            sys.exit(0)
            
if res == -2147000000:
    print(0)
else:
    print(res-1)         
       