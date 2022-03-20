import sys
def DFS(L, sum):
    if L==n:
        if sum == (total-sum):
            print("YES")
            sys.exit(0)
    else:
        DFS(L+1, sum + a[L])
        DFS(L+1, sum)

if __name__ == "__main__":
    n = 6
    a = [1,3,5,6,7,10]
    total = sum(a)
    DFS(0,0)
    print("NO")




# --------------------
arr = [1,3,5,6,7,10]
ch = [0] * 6
def dfs(L):
    if L == 6:
        tot = 0
        for i in range(6):
            if ch[i] == 1:
                tot += arr[i]
        
        if tot == sum(arr)//2:
            print("YES")
            sys.exit(0)
        else:
            print("NO")
    else:
        ch[L] = 1
        dfs(L+1)
        ch[L] = 0
        dfs(L+1)

dfs(0)
