import heapq

def solution(scoville, K):
    heapq.heapify(scoville)
    answer = 0
    
    
    while any(k < K for k in scoville):
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        mix = first + (2 * second)
        heapq.heappush(scoville, mix)
        answer += 1
        
        if len(scoville) == 1 and scoville[0] < K:
            return -1
    
    return answer

    # 다른 사람 풀이
    import heapq as hq

    def solution(scoville, K):
        hq.heapify(scoville)
        answer = 0
        while True:
            first = hq.heappop(scoville)
            if first >= K:
                break
            if len(scoville) == 0:
                return -1
            second = hq.heapop(scoville)
            hq.heappush(scoville, first + second * 2)
            answer += 1
        return answer