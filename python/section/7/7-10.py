import sys
sys.stdin = open("7-10.txt", "r")

n, max_w = map(int,input().split())
dy = [0] * (max_w + 1)

for i in range(n):
    w, v = map(int, input().split())
    for j in range(max_w+1):
        if j-w >= 0:
            dy[j] = max(dy[j], dy[j-w] + v)
print(dy[max_w])
