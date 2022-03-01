# 일일 온도

from typing import List


def dailyTemperatures(T: List[int]) -> List[int]:
    answer = [0] * len(T)

    stack = []

    for i, cur in enumerate(T):
        while stack and cur > T[stack[-1]]:
            last = stack.pop()
            answer[last] = i - last
        stack.append(i)

    return answer