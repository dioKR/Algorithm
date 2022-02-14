from typing import List

nums = [2,7,11,15]
target = 9

def solution(nums:List[int], target: int) -> List[int]:
    for i in range(len(nums)):
        if (target - nums[i]) in nums and i is not nums.index(target-nums[i]):
            return [i, nums.index(target-nums[i])]

# 풀이. 첫 번째 수를 뺀 결과 키 조회
def twoSum(nums:List[int], target: int) -> List[int]:
    nums_map = {}

    for i, num in enumerate(nums):
        nums_map[num] = i

    for i, num in enumerate(nums):
        if target - num in nums_map and i != nums_map[target-num]:
            return [i, nums_map[target-num]]

# 조회 구조 개선
def twoSum2(nums:List[int], target: int) -> List[int]:
    nums_map={}
    for i, num in enumerate(nums):
        if target-num in nums_map:
            return [nums_map[target-num], i]
        nums_map[num] = i

# 배열이 정렬되어 있을때 투포인터를 이용
def twoSum3(nums:List[int], target: int) -> List[int]:
    left, right = 0, len(nums) - 1
    while not left == right:
        if nums[left] + nums[right] < target:
            left += 1
        elif nums[left] + nums[right] > target:
            right -= 1
        else:
            return [left, right]

