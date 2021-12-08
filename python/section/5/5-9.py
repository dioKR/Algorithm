# 수열 추측하기
import sys
sys.stdin = open("5-9.txt", "r")
input = sys.stdin.readline

def Combi(n, c):
    if c == 0:
        return 1
    elif n < c:
        return 0
    else:
        return Combi(n-1, c-1) + Combi(n-1, c)

def DFS(L):
    global res
    if  L == n:
        for j in range(n):
            res += (b[j] * p[j])
        if res == f:
            for k in range(n):
                print(p[k], end=" ")
            sys.exit(0)
        else:
            res = 0
    else:
        for i in range(1,n+1):
            if ch[i] == 0:
                ch[i] = 1
                p[L] = i
                DFS(L+1)
                ch[i] = 0

if __name__ == "__main__":
    n, f = map(int, input().split())
    ch = [0] * (n+1)
    b = [0] * n
    p = [0] * n
    res = 0

    for i in range(n):
        b[i] = Combi(n-1,i)
    DFS(0)
    