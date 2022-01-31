def solution(n):
    answer = 0
    for i in range(1,n+1):
        sum = 0
        j = i
        while True:
            sum += j
            j += 1
            if sum > n:
                i = j
                break
            elif sum == n:
                i = j
                answer += 1
                break
    return answer

# n의 약수 중 홀수가 몇개 있느냐? 로 접근한 문제풀이
def expressions(num):
    return len([i for i in range(1,num+1,2) if num % i is 0])

def expressions2(num):
    answer = 0
    for i in range(1,num+1):
        s = 0
        while s < num:
            s+=i
            i+=1
        if s == num:
            answer += 1
    return answer