import sys
sys.stdin = open("1-3.txt", "rt")

n, m = map(int,input().split())
a = list(map(int,input().split()))

lt = 1
rt = sum(a)
res = 0

while lt <= rt:
    mid = (lt+rt)//2
    cnt = 1
    tmp = 0
    for x in a:
        tmp += x
        if tmp > mid:
            tmp = x
            cnt += 1
    if cnt <= m:
        res = mid
        rt = mid - 1
    else:
        lt = mid + 1

print(res)

