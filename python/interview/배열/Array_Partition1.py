from typing import List
def arrayPairSum(nums: List[int]) -> int:
    return sum(sorted(nums)[::2])