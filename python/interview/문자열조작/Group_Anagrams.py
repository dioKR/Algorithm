from collections import defaultdict
import collections
from typing import List

data = ["eat", "tea", "tan", "ate", "nat", "bat"]

# 나의 문제풀이
def solution(strs: List[str]) -> List[List[str]]:
    answer = []
    dict = {}
    for str in strs:
        tmp = []
        for s in str:
            tmp.append(s)
        tmp.sort()
        k = ''.join(tmp)
        if k in dict:
            dict[k].append(str)
        else:
            dict[k] = [str]
    
    for v in dict.values():
        answer.append(sorted(v))

    return answer


# 다른 풀이1. 정렬하여 딕셔너리에 추가
def groupAnagrams(strs:List[str]) -> List[List[str]]:
    anagrams = collections.defaultdict(list)

    for word in strs:
        anagrams[''.join(sorted(word))].append(word)
    
    return list(anagrams.values())