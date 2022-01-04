n, m = map(int, input().split())
# 0 북, 1 동, 2 남, 3 서

d = [[0] * m for _ in range(n)]
x, y, dir = map(int, input().split())
d[x][y] = 1

dx = [-1,0,1,0]
dy = [0,1,0,-1]
board = []
for i in range(n):
    board.append(list(map(int,input().split())))


def turn_left():
    global dir
    dir -= 1
    if dir == -1:
        dir = 3

count = 1
turn_time = 0
while True:
    turn_left()
    nx = x+dx[dir]
    ny = y+dy[dir]

    if d[nx][ny] == 0 and board[nx][ny] == 0:
        d[nx][ny] = 1
        x = nx
        y = ny
        count += 1
        turn_time = 0
        continue
    else:
        turn_time += 1
    
    if turn_time == 4:
        nx = x - dx[dir]
        ny = y - dy[dir]
        if board[nx][ny] == 0:
            x = nx
            y = ny
        else:
            break
        turn_time = 0
print(count)
