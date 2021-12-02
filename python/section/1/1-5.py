import sys
sys.stdin = open("1-5.txt", "rt")

N, M = map(int, input().split())
arr = [0] * (N+M+1)

for i in range (1,N+1):
    for j in range(1, M+1):
        arr[i+j] += 1

_max = max(arr)

for i in range(1, N+M+1):
    if(_max == arr[i]):
        print(i, end= "")