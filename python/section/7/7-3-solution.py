# 도전과제 : 계단오르기(메모제이션)
# DP는 원래 바텀업 방식이다
# 작은 문제부터 큰문제를 풀어가는 방식
# 탑다운은 넓은의미에서 동적계획법이다.
import sys
sys.stdin = open("7-3.txt","r")

n = int(input())
dy = [0] * (n+1)

dy[1] = 1
dy[2] = 2

for i in range(3, n+1):
    dy[i] = dy[i-1] + dy[i-2]

print(dy[n])

