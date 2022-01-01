n = int(input())
data = list(input().split(" "))

dict = {
    "R": 0,
    "D": 1,
    "L": 2,
    "U": 3,
}

dx = [0,1,0,-1]
dy = [1,0,-1,0]

x = 1
y = 1
for dir in data:
    index = dict[dir]
    if 1 <= x + dx[index] <= n and 1 <= y + dy[index] <= n:
        x += dx[index]
        y += dy[index]
print(x,y)
    
        
    