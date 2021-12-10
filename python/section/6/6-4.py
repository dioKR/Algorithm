# 동전 바꿔주기 (DFS)
import sys
sys.stdin = open("6-4.txt", "r")

def DFS(L, sum):
    global cnt
    if sum > t:
        return 
    if L == k:
        if sum == t:
            cnt+=1
    else:
        for i in range(arr[L][1] + 1):
            DFS(L+1, sum + (arr[L][0] * i))

if __name__ == "__main__":
    t = int(input()) # 금액
    k = int(input()) # 동전의 가지 수
    arr = []

    for _ in range(k):
        a, b = map(int, input().split())
        arr.append((a,b))
    
    arr.sort(key=(lambda x:x[0]), reverse=True)
    
    cnt = 0
    DFS(0, 0)
    print(cnt)
        
    
