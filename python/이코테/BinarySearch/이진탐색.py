# 순차탐색
# 리스트 안에  있는 특정한
# 데이터를 찾기 위해 앞에서부터 
# 데이터를 하나씩 확인하는 방법

# 이진탐색
# 정렬되어 있는 리스트에서
# 탐색 범위를 절반씩 좁혀가며 데이터를
# 탐색하는 방법
# 이진탐색은 시작점, 끝점, 중간점을 이용하여
# 탐색범위 설정
# 시간복잡도 : O(logN)


# 값이 4인 원소 찾기
arr = [0,2,4,6,8,10,12,14,16,18]

def binary_search(arr, target, start, end):
    if start>end:
        return None
    mid = (start + end) // 2
    if arr[mid] == target:
        return mid
    elif arr[mid] > target:
        return binary_search(arr, target, start, mid-1)
    else:
        return binary_search(arr, target, mid+1, end)

result = binary_search(arr, 4, 0, len(arr))
print(result+1)


