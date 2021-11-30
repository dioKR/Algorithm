# -*- coding: utf-8 -*-
# 반복문


# 순차적으로 정수 리스트를 만든다.
a = range(10)  # 0 ~ 9
print(list(a))


b = range(1, 11)  # 1 ~ 10
print(b)


for i in range(10):
    print(i)


for i in range(10, 0, -1):
    print(i, '', ' ')


i = 1
while i <= 10:
    print(i)
    i = i+1

j = 10
while j >= 1:
    print(j)
    j = j-1

k = 1
while True:
    print(k)
    if k == 5:
        break
    k += 1

for i in range(1, 11):
    if i % 2 == 0:
        continue
    print(i)


# for else 구문 : for문이 정상적으로 끝나지 않았을때 else문 실행
for i in range(1, 11):
    print(i)
    if i == 5:
        break
else:
    print(11)
