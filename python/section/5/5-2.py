# 이진트리 탐색

def DFS(x):
    if x >= 8:
        return
    else:  
        if visited[x] == 0:           
            # 전위 
            DFS(x*2)
            # 중위
            DFS(x*2+1)
            # 후위
            print(x)
            visited[x] = 1

visited = [0] * 8


if __name__ == "__main__":
    DFS(1)