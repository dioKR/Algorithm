import sys
sys.stdin = open("1-2.txt", "rt")

n, k = map(int, input().split())
a = list(map(int, input().split()))
res = set()  # 자료구조 set : 중복제거

for i in range(n):
    for j in range(i+1, n):
        for m in range(j+1, n):
            res.add(a[i] + a[j] + a[m])
res = list(res)
res.sort(resverse=True)
print(res[k-1])