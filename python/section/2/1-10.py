# 스도쿠 검사
import sys
sys.stdin = open("1-10.txt","rt")

def checkRow(row):
    for i in range(1,10):
        if row.count(i) != 1:
            return False
    else:
        return True


def checkMap(m):
    for i in range(9):
        if not checkRow(m[i]):
            return False
    
    for i in range(9):
        ch = [0] * 9
        for j in range(9):
            ch[j] = m[j][i]
        if not checkRow(ch):
            return False
    
    for k in range(9):
        ch = [0] * 9
        index = 0
        _row = k%3
        _col = k//3
        for i in range(_row*3, _row*3+3):
            for j in range(_col*3, _col*3+3):
                ch[index] = m[i][j]
                index += 1
        if not checkRow(ch):
            return False
    
    return True



_map = [list(map(int, input().split())) for _ in range(9)]



if checkMap(_map):
    print("YES")
else:
    print("NO")

