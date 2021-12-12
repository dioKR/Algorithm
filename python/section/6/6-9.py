# 미로의 최단거리 경로 (BFS)
import sys
sys.stdin = open("6-9.txt", "r")
from collections import deque

graph = [list(map(int,input().split())) for _ in range(7)]

dx = [1,0,-1,0]
dy = [0,1,0,-1]

Q = deque()
Q.append((0,0))

while Q:
    cur = Q.popleft()
    x = cur[0]
    y = cur[1]
    
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        
        if 0 <= nx < 7 and 0 <= ny < 7 and graph[nx][ny] == 0:
            graph[nx][ny] = graph[x][y] + 1
            Q.append((nx,ny))
    

print(graph[6][6])
