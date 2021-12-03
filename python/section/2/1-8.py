# 곳감
import sys
sys.stdin = open("1-8.txt", "rt")

def rotateRow(row, direction):
    L = len(row)
    if direction == 0:
        tmp = row[0]
        for i in range(1, L):
            row[i-1] = row[i]
        row[L-1] = tmp
    else:
        tmp = row[L-1]
        for i in range(L-2, -1, -1):
            row[i+1] = row[i]
        row[0] = tmp

n = int(input())
_map = [list(map(int, input().split())) for _ in range(n)]
m = int(input())

for i in range(m):
    rowNum, direction, rotateNum = map(int, input().split())
    
    for _ in range(rotateNum):
        rotateRow(_map[rowNum-1], direction)

result = 0
for i in range(n):
    if i <= n//2:
        for j in range(0+i, n-i):
            result += _map[i][j]
    else:
        for j in range(0+(n-i-1), i+1):
            result += _map[i][j]
print(result)

