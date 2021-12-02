import sys

sys.stdin = open("1-4.txt", "rt")

# 더 깔끔하게 풀 수 있을 것 같은데... 흠..
N = int(input())
arr = list(map(int, input().split()))

avg = round(sum(arr)/N)
dist = [0] * N

for i in range(N):
    dist[i] = abs(arr[i] - avg)

cur_dist = 99999
cur_idx = 0
for index, distance in enumerate(dist):
    if cur_dist > distance:
        cur_dist = distance
        cur_idx = index
    elif cur_dist == distance:
        if arr[index] > arr[cur_idx]:
            cur_dist = distance
            cur_idx = index
print(avg, cur_idx+1)