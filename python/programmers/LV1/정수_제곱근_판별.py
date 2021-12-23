# 나의 틀린 풀이
def WrongSol(n):
    num = n ** 0.5;
    if num ** 2 == n:
        answer = (num+1) ** 2
    else:
        answer = -1
    return answer

# 나의 맞은 풀이
def solution(n):
    num = n ** 0.5;
    if num == int(num):
        answer = (num+1) ** 2
    else:
        answer = -1
    return answer

# 다른 사람 풀이
def solution2(n):
    num = n ** 0.5;
    if num % 1 == 0:
        answer = (num+1) ** 2
    else: 
        answer = -1
    return answer