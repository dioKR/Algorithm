n = int(input())
data = list(map(int,input().split()))
data.sort()

target = 1
for x in data: # 1, 1, 2, 3, 9 
    if target < x:
        break
    target+=x
    print(target, end=" ")
print(target)