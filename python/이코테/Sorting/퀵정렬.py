# 기준 데이터를 설정하고
# 그 기준보다 큰 데이터와 작은 데이터의 위치를 바꾼다.
# 가장 기본적인 퀵 정렬은 첫번째 데이터를 기준으로 설정

arr = [5,7,9,0,3,1,6,2,4,8]

# 시간복잡도: O(NlogN)
# 최악의 경우: O(N2)
# 공간복잡도: O(N)

def solution(arr, start, end):
    if start >= end:
        return
    pivot = start
    left = start+1
    right = end
    while left <= right:
        while left <= end and arr[left] <= arr[pivot]:
            left += 1
        while right > start and arr[right] >= arr[pivot]:
            right -= 1
        if left > right:
            arr[right], arr[pivot] = arr[pivot], arr[right]
        else:
            arr[left], arr[right] = arr[right], arr[left]
    solution(arr, start, right-1)
    solution(arr, right+1, end)

def quick_sort(array):
    if len(array) <= 1:
        return array
    pivot = arr[0]
    tail = arr[1:]
    left_side = [x for x in tail if x <= pivot]
    right_side = [x for x in tail if x > pivot]
    return quick_sort(left_side) + [pivot] + quick_sort(right_side)


print(arr)
solution(arr, 0, len(arr)-1)
print(arr)
