# 보드의 크기 : N
# 사과의 개수 : K
# 사과의 위치 : 행, 열
# 방향 변환 횟수 : L
# X초 , C = "L", "D"
N = int(input())
board = [[0] * N for _ in range(n)]

K = int(input())
for _ in range(K):
    row, col = map(int,input().split(" "))
    board[row-1][col-1] = 1

L = int(input())
info = []
for _ in range(L):
    X, C = input().split(" ")
    info.append(int(X), C)

dx = [0,1,0,-1]
dy = [1,0,-1,0]

def turn(direction, c):
    if C == "L":
        direction = (direction-1)%4
    else:
        direction = (direction+1)%4
    return direction

def simulate():
    x, y = 1, 1
    board[x][y] = 2
    direction = 0
    time = 0
    index = 0
    q = [(x,y)]
    
    while True:
        nx = x + dx[direction]
        ny = y + dy[direction]
        if 1<=nx and nx<=N and 1<=ny and ny<=N and board[nx][ny] != 2:
            if board[nx][ny] == 0:
                board[nx][ny] = 2
                q.append((nx,ny))
                px, py = q.pop(0)
                board[px][py] = 0
            if board[nx][ny] == 1:
                board[nx][ny] = 2
                q.append((nx,ny))
        else:
            time += 1
            break
        x, y = nx, ny
        time += 1
        if index < 1 and time == info[index][0]:
            direction = turn(direction, info[index][1])
            index += 1
    return time

print(simulate())


# 출력 : 게임이 끝나는 시간