import sys
sys.stdin = open("1-4.txt", "rt")

# 최적의 답을 도출해 나가는 방법

def Count(len):
    cnt = 1
    ep = Line[0]
    for i in range(1, n):
        if Line[i] - ep >= len:
            cnt+=1
            ep = Line[i]
    return cnt

n, c = map(int,input().split())
Line = []
for _ in range(n):
    tmp = int(input())
    Line.append(tmp)
Line.sort()
lt = 1
rt = Line[n-1]

while lt <= rt:
    mid = (lt+rt)//2
    if Count(mid) >= c:
        res = mid
        lt = mid + 1
    else:
        rt = mid - 1
print(res)