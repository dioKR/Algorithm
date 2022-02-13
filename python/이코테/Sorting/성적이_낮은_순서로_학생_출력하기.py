n = int(input())

arr = []

for i in range(n):
    name, score = input().split()
    arr.append((name, int(score)))

arr.sort(key = lambda x:x[1])

for i in arr:
    print(i[0], end=" ")
