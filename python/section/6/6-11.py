# 단지 번호 붙이기
import sys
sys.stdin = open("6-11.txt", "r")
from collections import deque

def BFS(a,b):
    global graph
    tmp = 0
    q = deque()
    q.append((a,b))
    graph[a][b] = 0
    
    while q:
        tmp += 1
        cur = q.popleft()
        x = cur[0]
        y = cur[1]
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < n and graph[nx][ny] == 1:
                q.append((nx,ny))
                graph[nx][ny] = 0
    res.append(tmp)  
        

if __name__ == "__main__":
    dx = [1,0,-1,0]
    dy = [0,1,0,-1]

    n = int(input())
    graph = [list(map(int,input())) for _ in range(n)]
    cnt = 0
    res = []

    for i in range(n):
        for j in range(n):
            if graph[i][j] == 1: 
                BFS(i,j)
                cnt+=1
    print(cnt)
    res.sort()
    for x in res:
        print(x)


