n = 118372

# 나의 풀이
def solution(n):
    s = str(n)
    arr = []
    
    for i in s:
        arr.append(int(i))
    arr.sort(reverse = True)
    result = ''.join([str(_) for _ in arr])
    
    return int(result)

# 다른 사람 풀이
def solution2(n):
    ls = list(str(n))
    ls.sort(reverse=True)
    return int("".join(ls))
