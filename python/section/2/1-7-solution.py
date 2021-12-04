# 사과나무
import sys
sys.stdin = open("1-7.txt","rt")

n = int(input())
a = [list(map(int, input().split())) for i in range(n)]

res = 0
s = e = n//2

for i in range(n):
    for j in range(s, e+1):
        res += a[i][j]
    if i < n//2:
        s-=1
        e+=1
    else:
        s+=1
        s-=1
print(res)