n, m = map(int, input().split())

arr = list(map(int, input().split()))

def solution(arr, target):
    start = 0
    end = max(arr)

    result = 0
    while start <= end:
        mid = (start + end) // 2

        tot = 0
        for i in arr:
            if i - mid > 0:
                tot += (i-mid)
        
        if tot < target:
            end = mid - 1
        else:
            result = mid
            start = mid + 1
    return result

print(solution(arr, m))




