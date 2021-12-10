# 동전 분배하기 (DFS)

import sys
sys.stdin = open("6-5.txt", "r")

def DFS(L,a,b,c):
    global res
    if L == n:
        if a == b or b == c or a == c:
            return
        else:
            tmp = max(a,b,c) - min(a,b,c)
            if res > tmp:
                res = tmp 
    else:
        DFS(L+1, a + arr[L], b, c)
        DFS(L+1, a, b + arr[L], c)
        DFS(L+1, a, b, c + arr[L])


if __name__ == "__main__":
    n = int(input())
    arr = []
    res = 2147000000
    
    for i in range(n):
        arr.append(int(input()))

    DFS(0,0,0,0)
    print(res)
