def dfs(num):

    if num > 7:
        return

    dfs(num*2)
    dfs(num*2+1)
    print(num, end=" ")


dfs(1)