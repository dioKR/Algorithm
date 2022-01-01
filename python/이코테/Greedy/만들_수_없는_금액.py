import itertools as it

def combi(arr, n):
    result = []
    li = list(it.combinations(arr, n))
    for s in li:
        result.append(sum(s))
    return result
    
n = int(input())
coins = list(map(int,input().split()))
tot = sum(coins)
arr = [0] * (tot+1)

for i in range(1,n+1):
    sumArray = combi(coins, i)
    for j in sumArray:
        arr[j] = 1
        
for i in range(1,tot+1):
    if arr[i] == 0:
        print(i)
        break