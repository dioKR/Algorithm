def solution(n):
    cnt = format(n, 'b').count("1")
    i = n+1
    while True:
        if format(i,'b').count("1") == cnt:
            break
        else:
            i+=1
    return i

def nextBigNumber(n):
    num1 = bin(n).count('1')
    while True:
        n = n+1
        if num1 == bin(n).count('1'):
            break
    return n