# 플로이드 워샬 알고리즘
import sys
sys.stdin = open("7-13.txt", "r")

n, m = map(int,input().split())
M = 2147000000
dis = [[M] * n for _ in range(n)]

for i in range(n):
    dis[i][i] = 0

for i in range(m):
    a, b, c = map(int,input().split())
    dis[a-1][b-1] = c

for k in range(n):
    for i in range(n):
        for j in range(n):
            dis[i][j] = min(dis[i][j], dis[i][k] + dis[k][j])

for i in range(n):
    for j in range(n):
        if dis[i][j] == M:
            print("M", end = " ")
        else:
            print(dis[i][j], end = " ")
    print()