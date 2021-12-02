import sys
sys.stdin = open("1-8.txt", "rt")

def reverse(x):
    strX = str(x)
    reversed_strX = strX[::-1]    
    return int(reversed_strX.lstrip("0"))


def isPrime(x):
    for i in range(2,x):
        if x%i == 0:
            return False
    return True

N = int(input())
arr = list(map(int, input().split()))

for i in arr:
    _rev = reverse(i)
    if isPrime(_rev):
        print(_rev, end=" ")