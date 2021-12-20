import sys
sys.stdin = open("7-9.txt","r")

def DFS(x,y):
    if x == 0:
        dp[x][y] = dp[x][y-1] + board[x][y]
    elif y == 0:
        dp[x][y] = dp[x-1][y] + board[x][y]
    else:
        dp[x][y] = min(DFS(x-1,y), DFS(x,y-1)) + board[x][y]
    return dp[x][y]
    

if __name__ == "__main__":
    n = int(input())
    board = [list(map(int,input().split())) for _ in range(n)]
    dp = [[0] * n for _ in range(n)]
    
    dp[0][0] = board[0][0]
    DFS(n-1,n-1)
    print(dp[n-1][n-1])
    
    for i in dp:
        print(i)