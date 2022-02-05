# 처리되지 않은 데이터를 하나씩 골라 적절한 위치에 삽입
# 선택정렬보다 더 효율적으로 동작

arr = [7,5,9,0,3,1,6,2,4,8]

# 시간 복잡도: O(N2)
# 현재 리스트의 데이터가 거의 정렬되어 있는 상태라면
# 최선의 경우 O(N)
# 공간 복잡도: O(N)
def insertSorting(arr):
    for i in range(1, len(arr)):
        for j in range(i, 0, -1):
            if arr[j] < arr[j-1]:
                arr[j], arr[j-1] = arr[j-1], arr[j]
            else:
                break

print(arr)
insertSorting(arr)
print(arr)