def solution(n):    
    map = [[-1] * n for _ in range(n)]
    x, y = 0, 0
    num = 1
    dir = 1
    for i in range(n, 0, -1):
        for j in range(i):
            if j == i-1:
                dir += 1
            map[x][y] = num
            num += 1
            if dir%3 == 1:
                x += 1
            elif dir%3 == 2:
                y += 1
            elif dir%3 == 0:
                x -= 1
                y -= 1
        if x >= n:
            x -= 1

    answer = []
    for a in map:
        for i in a:
            if i != -1:
                answer.append(i)
    return answer

def solution2(n):
    dx = [0,1,-1]
    dy = [1,0,-1]
    b = [[0] * i for i in range(1,n+1)]
    x,y=0,0
    num=1
    d=0
    while num<=(n+1)*n//2:
        b[y][x] = num
        ny=y+dy[d]
        nx=x+dx[d]
        num+=1
        if 0<=ny<n and 0<=nx<=ny and b[ny][ny] == 0:
            y, x = ny, nx
        else:
            d=(d+1)%3
            y+=dy[d]
            x+=dx[d]
    return sum(b,[])