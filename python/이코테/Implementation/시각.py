n = 5

def solution(n):
    result = 0
    h = 0
    m = 0
    s = 0
    time = (n+1) * 60 * 60
    for i in range(time-1):
        tmp = ''
        s+=1
        if s == 60:
            m+=1
            s = 0
        if m == 60:
            h+=1
            m= 0
        tmp = str(h) + str(m) + str(s)
        if "3" in tmp:
            result += 1
        tmp = ''
    return result

print(solution(n))