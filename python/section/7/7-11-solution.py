# 동전 교환
import sys
sys.stdin = open("7-11.txt","r")

n = int(input())
coin = list(map(int,input().split()))
m = int(input())
dy = [1000] * (m+1)
dy[0] = 0

for i in range(n):
    for j in range(coin[i], m+1):
        dy[j] = min(dy[j-coin[i]]+1, dy[j])
print(dy[m])