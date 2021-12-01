# 함수 만들기


# 함수는 맨위에 정의할 것
def add(a, b):
    return a+b


print(add(1, 2))


# 함수는 여러개의 값을 리턴할 수 있다
# 튜플로 반환된다.
def add2(a, b):
    c = a+b
    d = a-b
    return c, d


print(add2(3, 2))


def isPrime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True


a = [12, 13, 7, 9, 19]

for i in a:
    if isPrime(i):
        print(i, end=" ")
