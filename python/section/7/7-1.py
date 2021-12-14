# 동적 계획법이란
# 네트워크 선 자르기 (Bottom-Up)

import sys
sys.stdin = open("7-1.txt","r")
n = int(input())
dy = [0] * (n+1)

dy[1] = 1
dy[2] = 2

for i in range(3,n+1):
    dy[i] = dy[i-1] + dy[i-2]
    
print(dy[n])