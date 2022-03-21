
def dfs(L, sum, tsum):
    global result
    if sum+(total-tsum) < result:
        return    
    if sum > c:
        return
    if L == n:
        if result < sum:
            result = sum
    else:
        dfs(L+1, sum + a[L], tsum + a[L])
        dfs(L+1, sum, tsum + a[L])

c = 259
n = 5
a = [81, 58, 42, 33, 61]
result = 0
total = sum(a)
dfs(0,0,0)
print(result)
