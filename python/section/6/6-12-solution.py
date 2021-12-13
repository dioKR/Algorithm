# 섬나라 아일랜드 
import sys
sys.stdin = open("6-12.txt","r")
from collections import deque
dx = [0,1,1,1,0,-1,-1,-1]
dy = [1,1,0,-1,-1,-1,0,1]

n = int(input())
board = [list(map(int, input())) for _ in range(n)]
cnt = 0
Q = deque()

for i in range(n):
    for j in range(n):
        if board[i][j] == 1:
            board[i][j] = 0
            Q.append((i,j))
            while Q:
                tmp = Q.popleft()
                for k in range(8):
                    x = tmp[0] + dx[k]
                    y = tmp[1] + dy[k]
                    if 0<=x<n and 0<=y<n and board[x][y] == 1:
                        board[x][y] = 0
                        Q.append((x,y))
            cnt+=1
print(cnt)
