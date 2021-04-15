n, m = map(int,input().split())
max = -99999

# 내 풀이
# 처음에 이중포문으로 모든 수를 다 받아오려 했다.
for i in range(n):
    data = list(map(int,input().split()))
    data.sort()
    
    if max < data[0]: 
        max = data[0]

print(max)
        
# min 함수 이용
result = 0
for i in range(n):
    data = list(map(int,input().split()))
    min_value = min(data)
    result = max(result, min_value)

# 2중 반복문 구조를 이용한 답안
for i in range(n):
    data = list(map(int,input().split()))
    min_value = 10001
    for a in data:
        min_value = min(min_value, a)

    result = max(result, min_value)