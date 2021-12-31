s = "1234"

def solution(s):
    if (len(s) == 4 or len(s) == 6) and s.isdigit():
        return True
    else:
        return False

def alpha_string46(s):
    return s.isdigit() and len(s) in (4,6)