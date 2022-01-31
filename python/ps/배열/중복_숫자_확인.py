# 숫자로 구성된 배열이 주어졌을 때 
# 그 배열에 중복된 숫자가 있는지 확인하는 함수를 작성하라.
# 중복된 숫자가 있다면 true 없다면 false

# [1,2,3,4,5] => false
# [1,1,2,3,4] => true
# [1,1,2,2,3] => true

numbers = [1,1,2,3,4]

# 시간 복잡도 : O(n2)
# 공간 복잡도 : O(n)

def solution1(numbers):
    list = []
    for num in numbers:
        if num in list:
            list.remove(num)
        else:
            list.append(num)
    
    if len(list) == len(numbers):
        return False
    else:
        return True

print(solution1(numbers))

# 시간 복잡도 : O(n) 
# 공간 복잡도 : O(n)

def solution2(numbers):
    hash = {}

    for num in numbers:
        hash[num] = hash.get(num, 0) + 1
    
    for num in numbers:
        if hash[num] == 2:
            return True
    else:
        return False
    

print(solution2(numbers))


