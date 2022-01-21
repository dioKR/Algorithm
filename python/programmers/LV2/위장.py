clothes = [
    ["yellowhat", "headgear"],
    ["bluesunglasses", "eyewear"],
    ["green_turban", "headgear"]
]

def solution(clothes):
    dict = {}

    for i in clothes:
        if i[1] in dict:
            dict[i[1]] += 1
        else:
            dict[i[1]] = 1
    
    cnt = 1
    for i in dict.values():
        cnt *= (i+1)
    return cnt-1

print(solution(clothes))


def solution2(clothes):
    from collections import Counter
    from functools import reduce

    cnt = Counter([kind for name, kind in clothes])
    ansser = reduce(lambda x,y: x*(y+1), cnt.values(), 1) - 1