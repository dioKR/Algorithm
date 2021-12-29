# 에라토스테네스의 체

def solution(n):
    answer = []
    arr = [0] * (n+1)

    for i in range(2, n+1):
        if arr[i] == 0:
            answer.append(arr[i])
        for j in range(i, n+1, i):
            arr[j] = 1
    return len(answer)

def solution2(n):
    num = set(range(2,n+1))
    for i in range(2, n+1):
        if i in num:
            num-=set(range(2*i,n+1,i))
    return len(num)