# 동전 교환
# 초기화를 1000으로 했어야하는데!!!
import sys
sys.stdin = open("7-11.txt", "r")

n = int(input())
coins = list(map(int,input().split()))
m = int(input())

dy = [0] * (m+1)

for coin in coins:
    for j in range(coin, m+1):
        dy[j] = min(dy[j-coin] + 1, j//coin)
print(dy[m])