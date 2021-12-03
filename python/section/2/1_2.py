import sys
sys.stdin = open("1_2.txt", "rt")

def strToNum(x):
    result = ''
    for i in x:
        if i.isdecimal():
            result += i
    result.lstrip("0")
    return int(result)

def countDivisor(x):
    result = 0
    for i in range(1, x+1):
        if x%i == 0:
            result += 1
    return result

input = input()
st = strToNum(input)
cnt = countDivisor(st)
print(cnt)




