def solution(s):
    a = list(map(int, s.split(" ")))
    return str(min(a)) + " " + str(max(a))