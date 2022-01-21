from collections import deque
s = "baabaa"

def solution(s):
    dq = deque(s)
    st = []
        
    while dq:
        cur = dq.popleft()
        if len(st) == 0:
            st.append(cur)
        elif st[-1] == cur:
            st.pop()
        else:
            st.append(cur)

    if len(st) == 0:
        return 1
    else:
        return 0
    
def solution2(s):
    answer = []
    for i in s:
        if not(answer):
            answer.append(i)
        else:
            if(answer[-1] == i):
                answer.pop()
            else:
                answer.append(i)
    return not(answer)