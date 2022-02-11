from typing import List
from unicodedata import digit

logs = ["dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"]

# 나의 문제 풀이
def solution(logs:List[str]):
    digit = []
    string = []
    for log in logs:
        k = log.split(" ")
        if k[1].isdigit():
            digit.append(log)
        else:
            string.append((log, k[0], k[1::]))
    
    string.sort(key = lambda x:(x[2],x[1]))
    
    return [x[0] for x in string] + digit


# 풀이1. 람다와 + 연산자를 이용
def reorderLogFiles(logs: List[str]) -> List[str]:
    letters, digits = [],[]
    for log in logs:
        if log.split()[1].isdigit():
            digits.append(log)
        else:
            letters.append(log)
    
    letters.sort(key=lambda x: (x.split()[1:], x.split()[0]))
    return letters + digits

reorderLogFiles(logs)