def solution(progresses, speeds):
    
    n = len(progresses)
    day = [0 for _ in range(n)]
    for i in range(n):
        day[i] = (100 - progresses[i]) // speeds[i]
        if (100 - progresses[i]) % speeds[i] != 0:
            day[i] += 1
    
    stack = []
    answer = []
    stack.append(day.pop(0))
    
    while day:
        current = day.pop(0)
        if stack[0] >= current:
            stack.append(current)
        else:
            answer.append(len(stack))
            stack = [current]
        if not day:
            answer.append(len(stack))
            
    return answer