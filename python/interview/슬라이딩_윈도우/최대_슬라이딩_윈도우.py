# Q75 최대 슬라이딩 윈도우
# 리트코드 239. Sliding Window Maximum
# 배열 nums가 주어졌을 때 k 크기의 슬라이딩 윈도우를 오른쪽 끝까지 이동하면서 최대 슬라이딩 윈도우를 구하라
# input
# nums = [1,3,-1,-3,5,3,6,7], k=3

# output
# [3,3,5,5,6,7]
from collections import deque


if __name__ == "__main__":
    nums = [1,3,-1,-3,5,3,6,7]
    k = 3

    # 시간 초과
    def solution(nums, k):
        result = []
        length = len(nums) - k + 1

        if length <= 0:
            return result

        for i in range(length):
            max_num =  max(nums[i:i+k])
            result.append(max_num)

        return result

    # 시간 초과
    def solution2(nums, k):
        result = []
        window = deque()

        current_max = float('-inf')

        for i,v in enumerate(nums):
            window.append(v)
            if i < k - 1:
                continue

            if current_max == float('-inf'):
                current_max = max(window)
            elif v > current_max:
                current_max = v
            result.append(current_max)

            if current_max == window.popleft():
                current_max = float('-inf')
        return result

    def solution3(nums, k):
        result = []
        dq = deque()  # 인덱스를 저장할 덱

        for i in range(len(nums)):
            # 윈도우에서 벗어난 인덱스 제거
            if dq and dq[0] < i - k + 1:
                dq.popleft()

            # 현재 값보다 작은 값들 제거 (뒤에서부터)
            while dq and nums[dq[-1]] < nums[i]:
                dq.pop()

            dq.append(i)

            # 첫 번째 윈도우부터 결과 저장
            if i >= k - 1:
                result.append(nums[dq[0]])  # 덱의 맨 앞이 최대값의 인덱스

        return result


    print(solution(nums, k))
