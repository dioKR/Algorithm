# 최대점수 구하기 (냅색 알고리즘)
# 2차원으로 접근하기
import sys
sys.stdin = open("7-12.txt", "r")
n, m = map(int,input().split())

dy = [[0] * (m+1) for _ in range(n+1)]

for i in range(1, n+1):
    pv, pt = map(int,input().split())
    dy[i] = dy[i-1].copy()
    for j in range(pt, m+1):
        dy[i][j] = max(dy[i-1][j-pt] + pv , dy[i][j])

for i in range(n+1):
    for j in range(m+1):
        print(dy[i][j], end =" ")
    print()