def solution(numbers, target):
    answer = 0
    
    def dfs(L, total):
        if L == len(numbers):
            if total == target:
                nonlocal answer
                answer += 1
            return total
        dfs(L+1, total + numbers[L])
        dfs(L+1, total - numbers[L])

    dfs(0, 0)
    return answer