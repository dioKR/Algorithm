import re # 정규표현식 지원 모듈

def solution(s):
    temp = []
    s = s.lower()
    s = s[0].upper() + s[1:]

    temp = re.findall(' +\w', s) # 정규표현식에서 + 기호는 "하나이상의" 라는 뜻이다.
    # 따라서 공백이 하나이상 and 문자하나(\w)로 이루어진것을 s에서 찾는다는 뜻이다.

    for i in temp:
        s = s.replace(i, i.upper())

    return s