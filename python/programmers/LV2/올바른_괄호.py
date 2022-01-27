def solution(s):
    st = []
    for i in s:
        if i == "(":
            st.append(i)
        else:
            if len(st) == 0:
                return False
            else:
                st.pop()
    
    if len(st) != 0:
        return False
    else:
        return True


def is_pair(s):
    x = 0
    for w in s:
        if x < 0:
            break
        x = x+1 if w == "(" else x-1 if w==")" else x
    return x == 0