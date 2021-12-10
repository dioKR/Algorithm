# 양팔 저울 (DFS)

import sys
sys.stdin = open("6-3.txt","r")

def DFS(L, gram):
    if _sum >= gram:
        ch.append(gram)
    if L == k:
        return
    else:
        # 상태 트리 
        # 1 : 합
        # 2 : 차
        # 3 : 원본값
        DFS(L+1, gram + w[L])
        DFS(L+1, gram - w[L])
        DFS(L+1, gram)


if __name__ == "__main__":
    k = int(input())
    w = list(map(int,input().split()))

    _sum = sum(w)
    ch = []

    DFS(0, 0)

    cnt = 0
    ch = set(ch)
    for i in ch:
        if i > 0:
            print(i, end=" ")
            cnt+=1
    print()
    print(_sum-cnt)
    
    
    
    