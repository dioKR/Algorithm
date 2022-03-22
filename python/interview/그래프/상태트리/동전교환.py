n = 3
coins = [1,2,5]
m = 15

result = 987654321

def dfs(L, s):
    global result
    if L > result:
        return
    if s > m:
        return
    if s == m:
        if result > L:
            result = L
    else:
        for i in range(n):
            dfs(L+1, s + coins[i])

dfs(0, 0)
print(result)