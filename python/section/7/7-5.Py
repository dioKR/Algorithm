# 최대 부분 증가 수열
# LIS : Longest Increasing Subsequence
import sys
sys.stdin = open("7-5.txt", "r")

n = int(input())
arr = list(map(int,input().split()))
arr.insert(0,0)

dy = [0] * (n+1)
dy[1] = 1

for i in range(2, n+1):
    for j in range(i-1, -1, -1):
        if arr[i] > arr[j]:
            L = dy[j] + 1
            if L > dy[i]:
                dy[i] = L
        else:
            dy[i] = 1


print(max(dy))
