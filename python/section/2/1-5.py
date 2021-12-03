# 수들의 합
import sys
sys.stdin = open("1-5.txt", "rt")

n, m = map(int, input().split())
arr = list(map(int, input().split()))

cnt = 0
for i in range(n):
    for j in range(i,n):
        if sum(arr[i:j+1]) == m:
            cnt += 1
            break
        if sum(arr[i:j+1]) > m:
            break
print(cnt)
