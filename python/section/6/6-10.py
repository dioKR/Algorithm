import sys
sys.stdin = open("6-10.txt", 'r')
# 나도 답이 맞은게 의심스러워

def DFS(a,b):
    global cnt
    if a == n-1 and b == n-1:
        cnt+=1
    else:
        for i in range(4):
            x = a + dx[i]
            y = b + dy[i]
            if 0 <= x < n and 0 <= y < n and graph[x][y] > graph[a][b] and ch[x][y] == 0:
                ch[x][y] = 1
                DFS(x,y)
                ch[x][y] = 0
                

if __name__ == "__main__":
    dx = [0,1,0,-1]
    dy = [1,0,-1,0]

    n = int(input())
    graph = [list(map(int,input().split())) for _ in range(n)]
    ch = [([0] * n) for _ in range(n)]
    cnt = 0
    
    ch[0][0] = 1
    DFS(0,0)
    print(cnt)