# 조합 구하기
import sys
sys.stdin = open("5-10.txt", "r")
input = sys.stdin.readline

def DFS(L, s):
    global cnt
    if L == m:
        for i in res:
            print(i, end=" ")
        print()
        cnt+=1
    else:
        for i in range(s, n+1):
            res[L] = i
            DFS(L+1, i+1)
        
                

if __name__ == "__main__":
    n, m = map(int,input().split())
    cnt = 0
    res = [0] * m
    DFS(0, 1)
