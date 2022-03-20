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
n = 6
arr = [1,3,5,6,7,10]
total = sum(arr)

def dfs(L, sum):
    if L == n:
        if sum == (total - sum):
            print("YES")
            sys.exit(0)
    else:
        dfs(L+1, sum + arr[L])
        dfs(L+1, sum)

dfs(0,0)
print("NO")