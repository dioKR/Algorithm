# 카드 역배치
import sys
sys.stdin = open("1-3.txt", "rt")

def swap(arr, a, b):
    while(a < b):
        arr[a-1], arr[b-1] = arr[b-1], arr[a-1]
        a += 1
        b -= 1


arr = [i for i in range(1,21)]
print(arr)

for i in range(10):
    a, b = map(int,input().split())
    swap(arr, a, b)
print(arr)