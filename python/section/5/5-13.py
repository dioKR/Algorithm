# 경로 탐색 (그래프 DFS)
import sys
sys.stdin = open("5-13.txt", "r")
input = sys.stdin.readline;

def DFS(start):
    global cnt
    if start == n:
        print(path)
        cnt+=1
    else:
        for i in range(1,n+1):
            if ch[i] == 0 and g[start][i] == 1:
                ch[i] = 1
                path.append(i)
                DFS(i)
                ch[i] = 0
                path.pop()
                
            


if __name__ == "__main__":
    n, m = map(int, input().split())

    cnt = 0
    g = [[0] * (n+1)  for _ in range(n+1)]
    ch = [0] * (n+1)

    for i in range(m):
        a, b = map(int,input().split())
        g[a][b] = 1
    
    path=[]
    DFS(1)
    print(cnt)
        
    

    
