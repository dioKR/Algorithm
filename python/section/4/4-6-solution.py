# 응급실
import sys
sys.stdin = open("4-6.txt","r")
from collections import deque

n, m = map(int, input().split())
Q = [(pos, val) for pos, val in enumerate(list(map(int, input().split())))]

Q = deque(Q)
cnt = 0
while True:
    cur = Q.popleft()
    if any(cur[1] < x[1] for x in Q):
        Q.append(cur)
    else:
        cnt+=1
        if cur[0] == m:
            break
print(cnt)
    