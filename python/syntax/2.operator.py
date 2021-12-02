# 변수입력과 연산자

a = input("숫자를 입력하세요 : ")
print(a)

a,b = input("숫자를 입력하세요 : ").split()
# a,b는 str

a,b= map(int, input("숫자를 입력하세요 :").split())
print(a+b)
print(a-b)
print(a*b)
print(a/b) # 나누기 연산자
print(a//b) # 몫 연산자
print(a%b) # 나머지 연산자
print(a**b) # 제곱 연산자

a= 4.3 #실수
b= 3 # 정수
c = a+b # 실수 + 정수 = 실수 (결과는 넓은 범위로 나온다)