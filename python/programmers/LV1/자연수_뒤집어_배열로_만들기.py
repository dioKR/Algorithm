n = 12345

# 나의 문제풀이
def solution(n):
    answer = list(int(_) for _ in str(n))
    answer.reverse()
    return answer

# 다른사람
def digit_reverse(n):
    return list(map(int, reversed(str(n))))

print(solution(n))