import sys
sys.stdin = open("4-5.txt", "rt")

from collections import deque

n, m = map(int, input().split())
q = deque()

for i in range(1, n+1):
    q.append(i)

cnt = 1
while len(q) > 1:
    if cnt == 3:
        q.popleft()
        cnt = 1
    else:
        tmp = q.popleft()
        q.append(tmp)
        cnt += 1

print(q.popleft())
