# 창고정리
# 이방법으로 푸는 문제가 아닌것같긴하지만...
# 일단 풀었음
import sys
sys.stdin = open("1-7.txt", "rt")

L = int(input())
a = list(map(int,input().split()))
M = int(input())

for i in range(M):
    a[a.index(max(a))] -= 1
    a[a.index(min(a))] += 1

res = max(a) - min(a)
print(res)