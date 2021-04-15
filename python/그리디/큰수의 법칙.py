# 입력 1 - 배열 크기, 더 할 횟수, 제한 (5,8,3)
# 입력 2 - 배열에 들어갈 수 (2,4,5,4,6)
# 출력 - 제일 큰 수

# 첫 풀이
# 답안은 맞췄지만
# M이 커진다면 시간초과 판정
n, m, k = map(int, input().split())
data = list(map(int, input().split()))
data.sort(reverse = True)
result = 0
cnt = 0 

for _ in range(m):
    if cnt < k :
        result += data[0]
        cnt += 1
    elif cnt == k :
        result += data[1]
        cnt = 0
print(result)
    
# 단순하게 푸는 답안 예시
n, m, k = map(int, input().split())
data = list(map(int, input().split()))

data.sort() #오름차순
first = data[n-1]
second = data[n-2]

result = 0

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
print(result)

#  답안 예시
n, m, k = map(int,input().split())
data = list(map(int,input().split()))

# 배열 정렬 (오름차순)
data.sort()

# 가장 큰 값, 그 다음 큰 값 저장
first = data[n-1]
second = data[n-2]

# 가장 큰 값 더해지는 횟수 구하기
count = int(m/(k+1)) * k
count += m % (k+1) # 홀수 일때

result = 0
result += first * count
result += second * (m-count)