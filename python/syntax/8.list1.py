# 리스와 내장함수 (1)

import random as r

#  빈 리스트 선언
a = []
b = list()

# 리스트 선언 방벙
c = [1, 2, 3, 4, 5]
d = list(range(1, 11))
print(d)
f = list([0] * 10)

# 삽입
a.append(6)
a.insert(1, 7)
print(a)


# 삭제
k = a.pop()  # 가장 뒤부터 팝 , index 입력 가능 -> 원하는 index의 값을 뽑아낸다.
print(a)
print(k)
a.remove(6)  # 원하는 value 삭제
print(a)

a.append(1111)
a.index(1111)  # 리스트 a에 존재하는 value의 index를 출력

sum(a)  # 리스트 a의 전체합
max(a)  # 리스트 a의 최대값
min(a)  # 리스트 a의 최소값

r.shuffle(a)  # 리스트 a를 섞어라

a.sort()  # a 오름차순 정렬
a.sort(reverse=True) # 내림차순
a.clear() # 리스트 값들 제거
