import sys
sys.stdin = open("1-2.txt", "rt")

k, n = map(int, input().split())

a = [int(input()) for _ in range(k)]
start = 0
end = max(a)

mid = 0
# N개보다 많이 만드는 것도 N개를 만드는 것에 포함 => 어떻게 구현할까?
while start <= end:
    mid = (start + end)//2
    cnt = 0
    for i in a:
        cnt += i//mid
    if cnt < n:
        end = mid-1
    elif cnt >= n:
        start = mid+1
    # else:
    #   print(mid)
    #   break
    
print(mid)




