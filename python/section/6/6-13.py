# 안전영역 BFS
import sys
from collections import deque
sys.stdin = open("6-13.txt","r")

def BFS(a, b, c):
    q = deque()
    q.append((a,b))
    ch[a][b] = 1
    
    while q:
        cur = q.popleft()
        x = cur[0]
        y = cur[1]
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < n and ch[nx][ny] == 0 and graph[nx][ny] > c:
                q.append((nx,ny))
                ch[nx][ny] = 1
    
    

if __name__ == "__main__":
    dx = [1,0,-1,0]
    dy = [0,1,0,-1]

    n = int(input())
    M = -2147000000
    graph = []
    ch = [([0] * n) for _ in range(n)]
    res = -2147000000
    
    for i in range(n):
        tmp = list(map(int, input().split()))
        _max = max(tmp)
        if _max > M:
            M = _max
        graph.append(tmp)
    
    
    for k in range(1, M+1):
        res_tmp = 0
        for i in range(n):
            for j in range(n):
                if graph[i][j] > k and ch[i][j] == 0:
                    BFS(i,j,k)
                    res_tmp += 1
        if res_tmp > res:
            res = res_tmp
        for i in range(n):
            for j in range(n):
                ch[i][j] = 0
    print(res)