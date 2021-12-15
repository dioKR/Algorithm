# 도전과제 : 돌다리 건너기 (Bottom-Up)
# 돌다리가 n개 이면 목적지는 n+1이기 때문에 n+2개의 배열을 만들었다 (0 ~ 8 => 9개)
# 돌다리가 7개 이면 목적지는 8이기 때문에 9개의 배열을 만들었다 (0~8 => 9개)
import sys
sys.stdin = open("7-4.txt", "r")

n = int(input())
dy = [0] * (n+2)

dy[1] = 1
dy[2] = 2

for i in range(3, n+2):
    dy[i] = dy[i-1] + dy[i-2]

print(dy[n+1])