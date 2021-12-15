# 가장 높은 탑 쌓기

import sys
sys.stdin = open("7-7.txt", "r")

n = int(input())
arr = [(0,0,0)]

dy = [0] * (n+1)

for i in range(n):
    area, h, weight = map(int,input().split())
    arr.append((area,h,weight))

res = 0

dy[1] = arr[1][1]

for i in range(2, n+1):
    max = 0
    for j in range(i-1, 0, -1):
        if arr[j][0] > arr[i][0] and arr[j][2] > arr[i][2] and dy[j] > max:
            max = dy[j]
    dy[i] = max + arr[i][1]
    if dy[i] > res:
        res = dy[i]
print(res)