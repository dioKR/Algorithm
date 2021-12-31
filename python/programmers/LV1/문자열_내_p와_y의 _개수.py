s = "PpYyoooyP"

def solution(s):
    s = s.lower()
    p = s.count("p")
    y = s.count("y")

    if p == y:
        return True
    else:
        return False
    

def numPY(s):
    return s.lower().count('p') == s.lower().count('y')