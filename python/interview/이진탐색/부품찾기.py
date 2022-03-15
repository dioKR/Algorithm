n = int(input())
arr1 = list(map(int, input().split()))

m = int(input())
arr2 = list(map(int, input().split()))


def binary_search(arr1, target):
    left, right = 0, n-1
    while left <= right:
        mid = (left + right) // 2
        if arr1[mid] == target:
            return "yes"
        elif arr1[mid] > target:
            right = mid - 1
        else:
            left = mid + 1
    return "no"

arr1.sort()
for i in range(m):
    print(binary_search(arr1, arr2[i]), end = " ")
