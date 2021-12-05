# 이분검색 , 이진탐색
import sys
sys.stdin = open("1-1.txt", "rt")

n, m = map(int, input().split())
a = list(map(int,input().split()))

a.sort()

start = 0
end = n-1

while start <= end:
    mid = (end+start)//2
    if a[mid] > m:
        end = mid-1
    elif a[mid] < m:
        start = mid+1
    else:
        print(mid+1)
        break