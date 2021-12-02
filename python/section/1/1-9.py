import sys
sys.stdin = open("1-9.txt", "rt")

N = int(input())
# 너무 긴데? -> 짧게해야할듯
result = 0
for i in range(N):
    tmp = 0
    arr = list(map(int, input().split()))
    _max = 0
    _value = 0
    for j in arr:
        cnt = arr.count(j)
        if _max < cnt:
            _max = cnt
            _value = j
    if _max == 3:
        tmp = 10000 + (_value * 1000)
    elif _max == 2:
        tmp = 1000 + (_value * 100)
    else:
        tmp = max(arr) * 100
    if result < tmp:
        result = tmp
print(result)
