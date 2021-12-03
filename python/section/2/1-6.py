import sys
sys.stdin = open("1-6.txt", "rt")

# 너무 navie한 방식인가?
n = int(input())
map = [list(map(int, input().split())) for _ in range(n)]
_max = -2176000000

# 행들의 합들 중 최대 값 구하기
for i in range(n):
    tmp = sum(map[i])
    if _max < tmp:
        _max = tmp

# 열들의 합들 중 최대 값 구하기
for i in range(n):
    tmp = 0
    for j in range(n):
        tmp += map[j][i]
    if _max < tmp:
        _max = tmp

# 대각선 합들 중 최대 값 구하기  
tmp = 0
for i in range(n):
    for j in range(n):
        if i==j:
            tmp += map[i][j]
    if _max < tmp:
        _max = tmp

tmp = 0
for i in range(n):
    for j in range(n):
        if i==n-1-j:
            tmp += map[i][j]
    if _max < tmp:
        _max = tmp

print(_max)