# 중복순열 구하기
import sys
sys.stdin = open("5-6.txt", "r")
# 입력량이 많을 때 빠르지만 문자열의 줄바꿈까지 읽어들임
input = sys.stdin.readline 
# s = input().rstrip(); <= 문자열 읽을시 처리

def DFS(L):
    global cnt
    if L == m:
        for i in range(L):
            print(res[i], end=" ")
        print()        
        cnt+=1
    else:
        for i in range(1,n+1):
            res[L] = i
            DFS(L+1)
            

if __name__ == "__main__":
    n, m = map(int,input().split())
    res = [0] * m
    cnt = 0
    DFS(0)
    print(cnt)