# 휴가 (삼성 SW역량평가 기출문제 : DFS활용)

import sys
sys.stdin = open("6-2.txt","r")
input = sys.stdin.readline

def DFS(L, sum):
    global res
    if L == n+1:
        if sum > res:
            res = sum
    else:
        if L+a[L-1][0] <= n+1:
            DFS(L+a[L-1][0], sum + a[L-1][1])
            DFS(L+1, sum)

if __name__ == "__main__":
    n = int(input())
    a = []
    for i in range(n):
        t, p = map(int,input().split())
        a.append((t,p))
    res = -2147000000

    DFS(1,0)
    print(res)
