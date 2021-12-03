# 사과나무
import sys
sys.stdin = open("1-7.txt","rt")

# 너무 naive 한 방법인가?
n = int(input())
map = [list(map(int, input().split())) for i in range(n)]
result = 0
half = n//2

for i in range(n):
    if i <= half:
        for j in range(half-i,half+i+1):
            result += map[i][j]
    else:
        for j in range(half-(n-1-i), half+(n-i)):
            result += map[i][j]

print(result)