import sys
sys.stdin = open("1-7.txt", "rt")

N = int(input())
# 맞나? 맞는지 모르겟네
arr = [False] * (N+1)

for i in range(2, N+1):
    if arr[i] == False:
        arr[i] = True
        print(i, end=" ")
        for j in range(i, N+1, i):
            arr[j] = True
