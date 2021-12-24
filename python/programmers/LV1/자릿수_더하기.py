n = 987

# 나의 문제풀이
def solution(n):
    answer = 0
    while n > 0:
        answer += n%10
        n = n // 10
    return answer

# 다른 사람 1
def sum_digit(n):
    if n < 10:
        return n
    return (n % 10) + sum_digit(n//10)

# 다른 사람 2
def sum_digit2(n):
    return sum([int(i) for i in str(n)])