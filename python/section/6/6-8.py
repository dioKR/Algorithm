# 사과나무 (BFS)
import sys
from collections import deque
sys.stdin = open("6-8.txt", "r")

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]


def BFS(x,y):
    global res
    dq = deque()
    res += graph[x][y]
    ch[x][y] = 1
    dq.append((x,y))
    L=0

    while True:
        if L == n//2:
            break
        size = len(dq)
        for i in range(size):
            tmp = dq.popleft()
            for j in range(4):
                nx = tmp[0] + dx[j]
                ny = tmp[1] + dy[j]
                if ch[nx][ny] == 0:
                    res += graph[nx][ny]
                    ch[nx][ny] = 1
                    dq.append((nx,ny))
        L+=1
        

res = 0
n = int(input())
graph = [list(map(int,input().split())) for i in range(n)]
ch = [([0] * n) for i in range(n)]

BFS(n//2, n//2)
print(res)