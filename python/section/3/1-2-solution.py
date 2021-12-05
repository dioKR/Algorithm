# 결정알고리즘이라는 방법론에서 이분검색을 사용함
# 답이 특정범위안에 있다라는 것을 알 수 있다

import sys
sys.stdin = open("1-2.txt", "rt")

def Count(len):
    cnt = 0
    for x in Line:
        cnt += (x//len)
    return cnt

k, n = map(int, input().split())
Line = []
res = 0
largest = 0

for i in range(k):
    tmp=int(input())
    Line.append(tmp)
    largest = max(largest, tmp)

lt = 1
rt = largest
while lt <= rt:
    mid = (lt+rt)//2
    if Count(mid) >= n:
        res = mid
        lt = mid+1
    else:
        rt = mid-1
print(res)