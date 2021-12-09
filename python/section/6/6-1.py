# 최대점수 구하기(DFS)
import sys
sys.stdin = open("6-1.txt","r")

def DFS(L, point, time, s):
    global res
    if L == n:
        return
    if time > m:
        return
    else:
        if point > res:
            res = point
        for i in range(s, n):
            DFS(L+1, point+a[i][0] ,time+a[i][1], i+1)


if __name__ == "__main__":
    n, m = map(int,input().split())
    a = []
    res = 0

    for i in range(n):
        point, score = map(int,input().split())
        a.append((point,score))
    
    DFS(0,0, 0, 0)
    print(res)