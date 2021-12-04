# 수들의 합
import sys
sys.stdin = open("1-5.txt", "rt")

n, m = map(int, input().split())
a = list(map(int, input().split()))
lt = 0
rt = 1
tot = a[0] # lt인덱스부터 rt인덱스 "앞"까지의 합 : lt ~ rt-1
cnt = 0
while True:
    if tot<m:
        if rt<n:
            tot+=a[rt]
            rt+=1
        else:
            break;
    elif tot == m:
        cnt+=1
        tot-=a[lt]
        lt+=1
    else:
        tot-=a[lt]
        lt+=1
print(cnt)