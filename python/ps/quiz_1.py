# 유일한 숫자 찾기
# numbers라는 int형 배열이 있다.
# 해당 배열에 들어있는 숫자들은 오직 한 숫자를 제외하고는 모두 두번씩 들어있다.
# 오직 한 번만 등장하는 숫자를 찾는 코드를 작성하라.


numbers = [1,2,2,3,3]

# 첫번째 해결책
# 리스트를 만들고 배열에 있는 숫자를 순회하면서 해당 숫자가 List에 들어있는지 확인한다.
# 리스트에 들어있으면 리스트에서 빼내고, 없으면 넣는다
# 결과적으로 리스트에는 유일한 숫자만 들어있으니 해당 숫자를 꺼내서 리턴한다.

# 시간 복잡도: O(n) * O(n) => O(n2)
# 공간 복잡도: O(n)
def solution1(numbers):
    list = []
    for num in numbers: # O(n)
        if num in list: # in 메서드가 순회를 하기때문에 O(n)
            list.remove(num) 
        else:
            list.append(num)
    return list[0]

print(solution1(numbers))

# 두번째 해결책 
# 해시맵을 사용해서 배열에 들어있는 숫자를 키, 숫자의 등장 횟수를 값으로 저장
# 숫자의 등장 횟수가 1인 키값을 찾아서 리턴한단.

# 시간 복잡도: O(n) + O(n) => O(2n) => O(n)
# 공간 복잡도: O(n)
def solution2(numbers):
    numbersMap = {}

    for num in numbers:
        numbersMap[num] = numbersMap.get(num, 0) + 1 # get의 시간복잡도는 O(1)

    for num in numbers:
        if numbersMap.get(num) == 1:
            return num
    return 0

print(solution2(numbers))


# 세번째 해결책
# XOR 비트 연산자 (^)를 사용한다.
# 두비트가 서로 다를때 1을 리턴한다
# 5 ^ 0 = 1
# 5 ^ 5 = 0

# 시간 복잡도 : O(n)
# 공간 복잡도 : O(1)
def solution3(numbers):
    uniqueNum = 0
    for num in numbers:
        uniqueNum ^= num
    return uniqueNum

print(solution3(numbers))