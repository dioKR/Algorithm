numbers = [1,1,3,4,5]
# 시간복잡도 : O(n2)
# 공간복잡도 : O(1)
def solution1(numbers):
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            if numbers[i] == numbers[j]:
                return True
    return False

# 가정 : 배열이 정렬 되어있다면 ?
# 1 1 2 2 6 6 7
# 시간복잡도 : O(NlogN)
# 공간복잡도 : O(logN)
def solution2(numbers):
    numbers.sort()  # O(NlogN), O(logN)
    for i in range(len(numbers)-1):
        if numbers[i] == numbers[i+1]:
            return True
    return False


# set 자료구조에 넣는다.
# 중복을 허용하지 않는다.

# 시간 복잡도: O(N)
# 공간 복잡도: O(N)
def solution3(numbers):
    numberSet = set()
    for num in numbers:
        if num in numberSet:
            return True
        else:
            numberSet.add(num)
    return False

print(solution3(numbers))


