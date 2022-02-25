# 유효한 괄호

s = ["(", ")"]

def isValid(self, s:str):
    st = []
    table = {
        ')' : '(',
        ']' : '[',
        '}' : '{',
    }

    for char in s:
        if char not in table:
            st.append(char)
        elif not st or table[char] != st.pop():
            return False
        return len(st) == 0

    