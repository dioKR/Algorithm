import itertools
import math

number = "011"

def is_prime_number(x):
    if x == 0 or x == 1:
        return False
    
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True

def solution(numbers):
    answer = 0
    numbers = list(numbers)
    s = []

    for i in range(1, len(numbers)+1):
        arr = list(map(''.join, itertools.permutations(numbers,i)))
        s.extend(arr)
    
    s = set(map(int, s))

    for i in s:
        if is_prime_number(i):
            answer += 1

    return answer

# 다른 사람 풀이
from itertools import permutations
def solution2(n):
    a = set()
    for i in range(len(n)):
        a |= set(map(int,map("".join, permutations(list(n), i + 1))))
    a -= set(range(0,2))
    for i in range(2, int(max(a)**0.5) + 1):
        a -= set(range(i*2, max(a) + 1, i))
    return len(a)