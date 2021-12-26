n, m, k = map(int,input().split())
arr = list(map(int,input().split()))

# n개의 숫자 중 m개를 뽑아서 가장 큰 수를 만들기
# 한 인덱스의 숫자는 연속해서 k번 까지만 가능

arr.sort(reverse=True)
result = arr[0] * (m//k*k) + arr[1] * (m%k)
print(result)


# 단순한 구현 방식
arr.sort()
first = arr[n-1]
second = arr[n-2]
while True:
    for i in range(k):
        if m == 0:
            break
        result += first
        m -= 1
    if m == 0:
        break
    result += second
    m -= 1