import sys
sys.stdin = open("1-6.txt", "rt")

# 코드가 너무 지저분
def digit_sum(x):
    _x = str(x)
    sum = 0
    for i in range(len(_x)):
        sum += int(_x[i])
    return sum

N = int(input())
arr = list(map(int, input().split()))

arr2 = [digit_sum(arr[i]) for i in range(N)]
max = max(arr2)

idx = 0
for i in range(N):
    if(max == arr2[i]):
        idx = i

print(arr[idx])
