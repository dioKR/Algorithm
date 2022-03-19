
def dfs(L):
    if L == n+1:
        for i in range(1,n+1):
            if ch[i]==1:
                print(i, end = " ")
        print()

    else:
        ch[L] = 1
        dfs(L+1)
        ch[L] = 0
        dfs(L+1)


n = 3
ch = [0]*(n+1)
dfs(1)