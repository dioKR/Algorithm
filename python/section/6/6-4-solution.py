# 동전 바꿔주기 (DFS)
import sys
sys.stdin = open("6-4.txt", "r")

def DFS(L, sum):
    global cnt
    if sum > T:
        return
    if L == k:
        if sum == T:
            cnt+=1
    else:
        for i in range(cn[L]+1):
            DFS(L+1, sum+(cv[L]*i))

if __name__ == "__main__":
    T = int(input()) # 금액
    k = int(input()) # 동전의 가지 수
    cv = list()
    cn = list()
    for i in range(k):
        a, b = map(int, input().split())
        cv.append(a)
        cn.append(b)
    cnt = 0
    DFS(0,0)
    print(cnt)