from collections import deque
import enum

def solution(priorities, location):
    answer = 0
    p = deque()
    
    for i in enumerate(priorities):
          p.append(i)
    
    while p:
        cur = p.popleft()
        
        if cur[0] == location and all(cur[1] >= a[1] for a in p):
            answer += 1
            return answer
        elif cur[0] != location and all(cur[1] >= a[1] for a in p):
            answer += 1
        else:
            p.append(cur)    
    
def solution2(priorities, location):
    queue = [(i,p) for i,p in enumerate(priorities)]
    answer = 0
    while True:
        cur = queue.pop(0)
        if any(cur[1] < q[1] for q in queue):
            queue.append(cur)
        else:
            answer += 1
            if cur[0] == location:
                return answer