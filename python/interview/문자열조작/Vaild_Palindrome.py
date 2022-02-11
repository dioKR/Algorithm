import re
from collections import deque
from typing import Deque
# 유효한 팰린드롬
# 팰린드롬 : 앞뒤가 똑같은 단어나 문장

s = "A man, a plan, a canal: Panama"
# s = "race a car"

# 나의 풀이
def solution(string:str):
    tmp = ""
    for s in string:
        if s.isalpha():
            tmp += s.lower()
        elif s.isdecimal():
            tmp += s
    return tmp == tmp[::-1]
      

# 다른 풀이 1
def isPalindrome(s: str) -> bool:
    strs: Deque = deque()

    for char in s:
        if char.isalnum():
            strs.append(char.lower())
    
    while len(strs) > 1:
        if strs.popleft() != strs.pop():
            return False

    return True

# 다른 풀이 2
# 파이썬의 슬라이싱 기능은 새로운 객체를 반환한다!
def isPalindrome2(s:str) -> bool:
    s = s.lower()
    s = re.sub('[^a-z0-9]', '', s)
    return s == s[::-1]

print(isPalindrome2(s))