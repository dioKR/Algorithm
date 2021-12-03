import sys
sys.stdin = open("1-9.txt", "rt")
dx = [1,0,-1,0]
dy = [0,1,0,-1]

N = int(input())
tmp = [list(map(int, input().split())) for _ in range(N)]
_map = [[0 for _ in range(N+2)] for _ in range(N+2)]


for i in range(1,N+1):
    for j in range(1, N+1):
        _map[i][j] = tmp[i-1][j-1]

def isBongUri(x,y):
    for i in range(4):
        if _map[x-dx[i]][y-dy[i]] >= _map[x][y]:
            return False
    else:
        return True

cnt = 0
for i in range(N+1):
    for j in range(N+1):
        if isBongUri(i,j):
            cnt+=1

print(cnt)