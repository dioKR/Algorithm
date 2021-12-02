import sys
sys.stdin = open("1-8.txt", "rt")

def reverse(x): # TIL.1 : 숫자 거꾸로 만들기
    res = 0
    while x > 0:
        t = x%10
        x = x//10
        res = res * 10 + t
    return res

def isPrime(x):
    if x==1:
        return False
    for i in range(2, x//2+1):
        if x%i==0:
            return False
    else: 
        return True

n = int(input())
a = list(map(int, input().split()))

for x in a:
    tmp=reverse(x)
    if isPrime(tmp):
        print(tmp, end=" ")


