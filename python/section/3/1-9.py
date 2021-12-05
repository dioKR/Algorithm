import sys
sys.stdin = open("1-9.txt","rt")

n = int(input())
a = list(map(int, input().split()))

cnt = 0
res = ''
prev = 0
for i in range(n):
    if a[0] > prev and a[-1] > prev:
        if a[0] < a[-1]:
            prev = a.pop(0)
            cnt += 1
            res += "L"
        elif a[0] > a[-1]:
            prev = a.pop()
            cnt += 1
            res += "R"
    elif a[0] > prev:
        prev = a.pop(0)
        cnt += 1
        res += "L"
    elif a[-1] > prev:
        prev = a.pop()
        cnt += 1
        res += "R"
print(cnt)
print(res)

