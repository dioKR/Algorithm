# 최소힙
import sys
sys.stdin = open("4-10.txt","r")
import heapq

min_heap = []
while True:
    val = int(input())

    if val == -1:
        break
    elif val == 0:
        if len(min_heap) == 0:
            print(-1)
        else:
            print(heapq.heappop(min_heap))
    else:
        heapq.heappush(min_heap, val)