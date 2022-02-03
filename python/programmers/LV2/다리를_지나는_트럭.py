from collections import deque

def solution(bridge_length, weight, truck_weights):
    answer = 0
    tot = 0
    bridge = deque([0] * bridge_length)
    dq = deque(truck_weights)

    while len(bridge):
        answer += 1
        completed = bridge.popleft()
        if completed != 0:
            tot -= completed
        
        if dq:
            if tot + dq[0] <= weight:
                cur = dq.popleft()
                tot += cur
                bridge.append(cur)
            else:
                bridge.append(0)
    return answer