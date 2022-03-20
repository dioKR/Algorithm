def solution(num):
    if num == 0:
        return

    solution(num//2)
    print(num%2, end="")

# solution(11)

def dfs(num, path):
    if num == 0:
        print(path)
        return path
    return dfs(num//2, str(num%2) + path)
    

answer = dfs(11, "")
print(answer)

