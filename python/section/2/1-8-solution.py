# 곳감
import sys
sys.stdin = open("1-8.txt", "rt")

n = int(input())
a = list(map(int, input().split()) for _ in range(n))

m = int(input())
for i in range(m):
    h, t, k = map(int, input().split())
    if t == 0:
        for _ in range(k):
            a[h-1].append(a[h-1].pop(0)) # 왼쪽 회전 한번!
    else:
        for _ in range(k):
            a[h-1].insert(0, a[h-1].pop()) # 오른쪽 회전 한번!

res = 0
s = 0
e = n-1
for i in range(n):
    for j in range(s, e+1):
        res += a[i][j]
    if i < n//2:
        s+=1
        e-=1
    else:
        s-=1
        e+=1
print(res)