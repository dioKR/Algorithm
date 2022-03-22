n = 3
m = 2

ch = [0] * (n+1)
cnt = 0

def dfs(L):
    global cnt
    if L == m:
        cnt += 1
        for i in range(1, n+1):
            if ch[i] == 1:
                print(i, end=" ")
        print()
    else:
        for i in range(1,n+1):
            if ch[i] == 0:
                ch[i] = 1
                dfs(L+1)
                ch[i] = 0

dfs(0)
print(cnt)