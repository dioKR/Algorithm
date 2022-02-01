from asyncio.windows_events import NULL


numbers = [2,3,5,7]
target = 8

# 시간복잡도 : O(n2)
# 공간복잡도 : O(1)

def solution1(numbers, target):    
    for i in range(len(numbers)-1):
        for j in range(i+1, len(numbers)):
            if numbers[i] + numbers[j] == target:
                return [i,j]

    return NULL

print(solution1(numbers, target))

# 시간복잡도 : O(n)
# 공간복잡도 : O(n)

def solution2(numbers, target):
    map = {}
    for i in range(len(numbers)):
        map[numbers[i]] = i
    
    for i in range(len(numbers)):
        numberToFind = target - numbers[i]
        if numberToFind in map and map[numberToFind] != i:
            return [i, map[numberToFind]]
    
    return NULL

print(solution2(numbers,target))


# 3개 Sum

def solution3(numbers, target):
    map = {}
    for i in range(len(numbers)):
        map[numbers[i]] = i

    for i in range(len(numbers-1)):
        for j in range(i+1, len(numbers)):
            numberToFind = target - numbers[i] - numbers[j]

            if numberToFind in map:
                return [i,j,map[numberToFind]]