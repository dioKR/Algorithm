n = 3
m = 2
ch = [0] * m
cnt = 0

def dfs(L):
    global cnt
    if L == m:
        cnt += 1
        for i in range(m):
            if ch[i] != 0:
                print(ch[i], end = " ")
        print()
    else:
        for i in range(1,n+1):
            ch[L] = i
            dfs(L+1)
            ch[L] = 0


dfs(0)
print(cnt)
