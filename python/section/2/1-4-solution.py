# sort 함수 호출시 시간복잡도 : 8log8
# 정렬이 이미되어있는것을 활용하여 정렬하면 시간복잡도 : 8

import sys
sys.stdin = open("1-4.txt", "rt")

n = int(input())
a = list(map(int,input().split()))
m = int(input)
b = list(map(int, input().split()))
p1 = p2 = 0
c = []

while p1<n and p2<m: # 둘다 만족할때 돈다
    if a[p1] <= b[p2]:
        c.append(a[p1])
        p1+=1
    else:
        c.append(b[p2])
        p2+=1

if p1<n:
    c=c+a[p1:]
if p2<m:
    c=c+b[p2:]

for x in c:
    print(x, end= " ")