# 송아지 찾기 (BFS : 상태트리탐색)
import sys
sys.stdin = open("6-7.txt","r")
from collections import deque

def BFS(L, sum):
    q.append((L, sum))
    while q:
        cur = q.popleft()
        if cur[1] == e-s:
            return cur[0]
        q.append((cur[0] + 1, cur[1] + 1))
        q.append((cur[0] + 1, cur[1] - 1))
        q.append((cur[0] + 1, cur[1] + 5))



if __name__ == "__main__":
    s, e = map(int,input().split())
    q = deque()
    print(BFS(0, 0))
    