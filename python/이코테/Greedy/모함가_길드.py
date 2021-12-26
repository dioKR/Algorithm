n = int(input())
arr = list(map(int,input().split()))

arr.sort(reverse=True)

i = 0
result = 0
while n > i:
    result += 1
    i += arr[i]
print(result)


# 솔루션
arr.sort() # 공포도 오름차순 정렬
result = 0
count = 0

for i in arr: # 공포도를 하나씩 확인
    count += 1 # 현재 그룹에 해당 모험가를 포함시키기
    if count >= i: # 현재 그룹의 모험가 수 >= 현재 공포도 => 그룹결성
        result += 1
        count = 0
print(result)