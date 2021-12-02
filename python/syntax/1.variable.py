# 변수명 정하기
# 1) 영문과 숫자, _로 이루어진다.
# 2) 대소문자 구분
# 3) 문자나, _로 시작
# 4) 특수문자 사용 금지
# 5) 키워드(예약어) 사용 금지 (if, for)

# 한꺼번에 대입 가능
a, b, c = 1, 2, 3 

# 값 교환
a, b = 10, 20
a, b = b, a

# 변수 타입 type()
print(type(a))

# 출력방식
print("hello")
print(a,b,c)
print("number : ", a,b,c)
print(a,b,c, sep=" ")
print(a, end=" ")