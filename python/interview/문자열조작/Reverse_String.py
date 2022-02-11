# 문자열 뒤집기
from typing import List


l = ["h", "e", "l", "l", "0"]

# 나의 문제풀이
def solution(s: List[str]) -> None:
    s.reverse()

print(l)  
solution(l)
print(l)

# 다른 문제풀이
def reverseString(s:List[str]) -> None:
    left, right = 0, len(s)-1
    
    while left < right:
        s[left], s[right] = s[right], s[left]
        left += 1
        right -= 1

print(l)  
reverseString(l)
print(l)