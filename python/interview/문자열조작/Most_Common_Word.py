# 가장 흔한 단어
import collections
from typing import List
from collections import Counter
import re

paragraph = "Bob hit a ball, the hit BALL flew far after it was hit"
banned = ["hit"]

# 나의 풀이
def solution(paragraph: str, banned: List[str]) -> str:
    t = re.sub('[^a-zA-Z]', ' ', paragraph.lower())
    p = Counter(t.split())
    
    for i in banned:
        if i in p.keys():
            del p[i]

    answer = p.most_common(1)[0]
    return answer[0]

    
    
# 풀이1. 리스트 컴프리헨션, Counter 객체사용

def mostCommonWord(paragraph: str, banned: List[str]) -> str:
    words = [word for word in re.sub(r'[^\w]', " ", paragraph).lower().split() if word not in banned]
    counts = collections.Counter(words)
    return counts.most_common(1)[0][0]

