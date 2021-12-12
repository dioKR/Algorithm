import sys
sys.stdin = open("6-12.txt","r")
from collections import deque

def BFS(a,b):
    global graph
    q = deque()
    q.append((a,b))
    graph[a][b] = 0
    
    while q:
        cur = q.popleft()
        x = cur[0]
        y = cur[1]
        
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if  0 <= nx < n and 0 <= ny < n and graph[nx][ny] == 1:
                q.append((nx,ny))
                graph[nx][ny] = 0
        
    
if __name__ == "__main__":
    dx = [0,1,1,1,0,-1,-1,-1]
    dy = [1,1,0,-1,-1,-1,0,1]
    
    n = int(input())
    graph = [list(map(int,input())) for _ in range(n)]
    cnt = 0
    
    for i in range(n):
        for j in range(n):
            if graph[i][j] == 1:
                BFS(i,j)
                cnt+=1
    print(cnt)