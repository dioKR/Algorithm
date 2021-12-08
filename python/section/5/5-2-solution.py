
def DFS(v):
    if v > 7:
        return
    else:
        print(v)
        DFS(v*2) # 왼쪽 자식 노드 호출
        DFS(v*2+1) # 오른쪽 자식 노드 호출


if __name__ == "__main__":
    DFS(1)