# 동전교환
import sys
sys.stdin = open("5-7.txt", "r");
input = sys.stdin.readline

def DFS(L,sum):
    global __min
    if sum >= m:
        if __min > L:
            __min = L
    else:
        for i in range(n):
            DFS(L+1, sum+a[i])


if __name__ == "__main__":
    n = int(input())
    a = list(map(int,input().split()))
    a.sort(reverse=True)
    m = int(input())
    __min = 2147000000
    DFS(0,0)
    print(__min)