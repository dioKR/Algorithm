# 응급실
import sys
sys.stdin = open("4-6.txt","r")
from collections import deque

n,m = map(int, input().split())
a = list(map(int,input().split()))
dq = deque()

for index, x in enumerate(a):
    dq.append((index,x))

cnt = 0
while dq:
    p = dq.popleft()
    
    for x in dq:
        if p[1] < x[1]:
            dq.append(p)
            break
    else:
        cnt+=1
        if p[0] == m:
            print(cnt)
            break


