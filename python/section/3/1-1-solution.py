# 이분검색 , 이진탐색
import sys
sys.stdin = open("1-1.txt", "rt")

n, m = map(int, input().split())
a = list(map(int,input().split()))
a.sort()

lt = 0 # left
rt = n-1 # right

while lt <= rt:
    mid = (lt+rt)//2
    if a[mid] == m:
        print(mid+1)
        break
    elif a[mid] > m:
        rt = mid-1
    else:
        lt = mid+1