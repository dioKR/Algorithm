s = "Zbcdefg"

def solution(s):
    s = list(s)
    s.sort(reverse=True)
    return "".join(s)

def solution(s):
    return ''.join(sorted(s, reverse=True))