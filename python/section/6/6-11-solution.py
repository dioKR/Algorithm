# 단지 번호 붙이기
# DFS 
import sys
sys.stdin = open("6-11.txt", "r")
dx = [1,0,-1,0]
dy = [0,1,0,-1]

def DFS(x,y):
    global cnt
    cnt += 1
    board[x][y] = 0
    for i in range(4):
        xx = x+dx[i]
        yy = y+dy[i]
        if 0<=xx<n and 0<=yy<n and board[xx][yy] == 1:
            DFS(xx, yy)

if __name__ == "__main__":
    n = int(input())
    board = [list(map(int,input())) for _ in range(n)]
    res = []
    cnt = 0

    for i in range(n):
        for j in range(n):
            if board[i][j] == 1:
                cnt = 0
                DFS(i,j)
                res.append(cnt)
    res.sort()
    print(len(res))
    for i in res:
        print(i)

