participant = ["leo", "kiki", "eden"]
completion = ["eden", "kiki"]

# 나의 풀이
def solution(participant, completion):
    dict = {}

    for i in participant:
        if i in dict:
            dict[i] += 1
        else:
            dict[i] = 1
    
    for i in completion:
        dict[i] -= 1
    
    for key in dict.keys():
        if dict[key] == 1:
            return key

print(solution(participant, completion))

# 다른 사람 풀이
import collections as cl

def solution2(participant, completion):
    answer = cl.Counter(participant) - cl.Counter(completion)
    return list(answer)[0]

print(solution2(participant, completion))
