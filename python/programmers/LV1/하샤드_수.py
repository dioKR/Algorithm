x = 10
def solution(x):
    tmp = x
    sum = 0

    while tmp > 0:
        sum += tmp%10
        tmp = tmp//10
    
    if x % sum == 0:
        return True
    else:
        return False

def Harshad(n):
    return n % sum([int(c) for c in str(n)]) == 0