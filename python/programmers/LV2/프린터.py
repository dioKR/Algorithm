from collections import deque

def solution(priorities, location):
    
    answer = 0
    p = deque()
    
    for i in enumerate(priorities):
          p.append(i)
    
    while p:
        cur = p.popleft()
        
        if cur[0] == location and all(cur[1] > a[1] for a in p):
            return (answer-1)
        else:
            answer += 1    
    
    return (answer-1)