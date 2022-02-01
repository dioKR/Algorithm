# 문제
# 1부터 100까지의 숫자 중에 50개의 랜덤한 숫자가 들어있는 배열이 있다.
# 이 배열을 O(n)의 사간 복잡도로 정렬하라
import random
arr = [x for x in range(1,101)]
random.shuffle(arr)
arr = arr[:50]

def solution1(numbers):
    booleans = [False] * 101
    sortedArray = [0] * 50

    for i in numbers:
        booleans[i] = True

    index = 0
    for i in range(100):
        if booleans[i]:
            sortedArray[index] = i
            index+=1
    return sortedArray

print(solution1(arr))
