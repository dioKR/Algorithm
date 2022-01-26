prices = [1,2,3,2,3]

def solution(prices):
    answer = []
    n = len(prices)

    for i in range(n):
        cnt = 0
        for j in range(i+1, n):
            if prices[i] <= prices[j]:
                cnt += 1
            else:
                 cnt += 1
                 break
        answer.append(cnt)
    return answer

def solution2(prices):
    answer = [0] * len(prices)
    for i in range(len(prices)):
        for j in range(i+1, len(prices)):
            if prices[i] <= prices[j]:
                answer[i] += 1
            else:
                answer[i] += 1
                break
    return answer