import sys
sys.stdin = open("1_2.txt", "rt")

s = input()

res = 0
for x in s:
    if x.isdecimal(): # 0~9까지만
        res = res * 10 + int(x)
print(res)

cnt = 0
for i in range(1, res+1):
    if res % i == 0:
        cnt+=1
print(cnt)