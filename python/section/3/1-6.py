# 씨름 선수
import sys
sys.stdin = open("1-6.txt","rt")

n = int(input())

a = list(tuple(map(int,input().split())) for _ in range(n))

cnt = 0
for i in range(n):
    p = True
    for j in range(n):
        if a[i][0] < a[j][0] and a[i][1] < a[j][1]:
            p = False
            break
    if p:
        cnt+=1
print(cnt)

