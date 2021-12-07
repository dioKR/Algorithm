# 최대 힙

import sys
sys.stdin = open("4-11.txt","r")
import heapq

max_heap = []
while True:
    val = int(input())

    if val == -1:
        break
    elif val == 0:
        if len(max_heap) == 0:
            print(-1)
        else:
            print(heapq.heappop(max_heap)[1])
    else:
        heapq.heappush(max_heap, (-val, val))