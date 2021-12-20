# 알리바바와 40인의 도둑 (Bottom-Up)
import sys
sys.stdin = open("7-8.txt", "r")

n = int(input())
board = [list(map(int,input().split())) for _ in range(n)]
dp = [[0] * n for _ in range(n)]


dp[0] = board[0]
for i in range(n):
    dp[i][0] = board[i][0]


for i in range(1,n):
    dp[0][i] += dp[0][i-1]
    dp[i][0] += dp[i-1][0]
    
for i in range(1,n):
    for j in range(1,n):
        dp[i][j] = min(dp[i-1][j], dp[i][j-1]) + board[i][j]
        
for i in dp:
    print(i)
    
print(dp[n-1][n-1])