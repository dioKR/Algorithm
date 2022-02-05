# 처리되지 않은 데이터 중에서
# 가장 작은 데이터를 선택하여
# 맨 앞에 있는 데이터와 바꾸는 것을 반복

arr = [7,5,9,0,3,1,6,2,4,8]

def selectionSorting(arr):
    for i in range(len(arr)-1):
        _min = 99999999
        for j in range(i, len(arr)):
            if _min > arr[j]:
                _min = arr[j]
                index = j
        arr[i], arr[index] = arr[index], arr[i]

# 시간 복잡도: O(N2)
# 공간 복잡도: O(N)
def solution(arr):
    for i in range(len(arr)):
        min_index = i
        for j in range(i+1, len(arr)):
            if arr[min_index] > arr[j]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]


