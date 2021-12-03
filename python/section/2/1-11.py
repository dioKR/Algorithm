# 격자판 회문수
import sys
sys.stdin = open("1-11.txt","rt")

_map = [list(map(int, input().split())) for _ in range(7)]

def countRow(arr):
    cnt = 0
    for i in range(0,3):
        string = ""
        for j in range(i, i+5):
            string += str(arr[j])
        if string == string[::-1]:
            cnt += 1
    return cnt

result = 0
for i in range(7):
    result += countRow(_map[i])

for i in range(7):
    row = []
    for j in range(7):
        row.append(_map[j][i])
    result += countRow(row)
print(result)