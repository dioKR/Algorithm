# 유클리드 알고리즘
# gcd , lcm

n = 3
m = 12

def solution(n,m):
    a, b, gcd = 0, 0 ,0
    
    if n > m:
        a, b = n, m
    else:
        a, b = m, m

    while b != 0:
        r = a%b
        if r == 0:
            gcd = b
            break
        else:
            a = b
            b = r
    lcm = (n//gcd) * m
    answer = [gcd, lcm]
    return answer


def solution2(a,b):
    c, d = max(a,b), min(a,b)
    t = 1
    while t > 0:
        t = c % d
        c, d = d, t
    answer = [c, int(a*b/c)]
    return answer
