import sys
sys.stdin = open("6-15.txt","r")

def DFS(x,y):
    global check
    global graph
    if x == 9:
        if graph[x][y] == 2:
            check = True
    else:
        for i in range(3):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < 10 and 0 <= ny < 10 and graph[nx][ny] != 0:
                graph[x][y] = 0
                DFS(nx,ny)
                graph[x][y] = 1
                break
                


if __name__ == "__main__":

    dx = [0,0,1]
    dy = [1,-1,0]
    check=False

    graph = [list(map(int,input().split())) for _ in range(10)]

    for i in range(10):
        if graph[0][i] == 1:
            DFS(0, i)
        if check:
            print(i)
            break
        