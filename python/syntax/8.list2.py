# 리스트와 내장함수 (2)

a = [23, 12, 36, 53, 19]
print(a[:3])  # 슬라이스
print(a[1:4])
print(len(a))


for i in range(len(a)):
    print(a[i], end=" ")
print()

for x in a:
    print(x, end=' ')
print()

for x in enumerate(a):  # tuple로 묶어줌
    print(x)
print()

b = (1, 2, 3, 4, 5)  # tuple => 값 변경 불가능!


for index, value in enumerate(a):
    print(index, value)
print()


# all , any
if all(60 > x for x in a): # 모두 성립해야 실행
    print("yes")
else:
    print("no")


if any(15>x for x in a): # 한번이라도 성립하면 실행
    print("yes")
else:
    print("no")