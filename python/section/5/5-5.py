# 바둑이 승차
import sys
sys.stdin = open("5-5.txt","r")

def DFS(L, sum):
    global __max
    if sum > c:
        return
    if L == n:
        if sum > __max:
            __max = sum
    else:
        DFS(L+1, sum + a[L])
        DFS(L+1, sum)


if __name__ == "__main__":
    c, n = map(int,input().split())
    a = []
    __max = 0

    for i in range(n):
        a.append(int(input()))
    print(a)
    DFS(0,0)
    print(__max)