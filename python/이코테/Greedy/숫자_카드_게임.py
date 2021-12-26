n, m = map(int, input().split())

arr = []
for i in range(n):
    arr.append(list(map(int,input().split())))
    
max = 0
for i in arr:
    if min(i) > max:
        max = min(i)
print(max)