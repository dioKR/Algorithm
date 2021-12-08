# 수들의 조합
import sys
sys.stdin = open("5-11.txt", "rt")
input = sys.stdin.readline

def DFS(L, s):
    global tmp, cnt
    if L == k:
        for i in res:
            tmp += i
        if tmp % m == 0:
            cnt+=1
        tmp = 0
    else:
        for i in range(s, n):
            res[L] = a[i]
            DFS(L+1, i+1)


if __name__ == "__main__":
    n, k = map(int,input().split())
    a = list(map(int, input().split()))
    m = int(input())

    tmp = 0
    cnt = 0
    res = [0] * k

    DFS(0, 0)
    print(cnt)