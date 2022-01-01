# 복잡도 : O(N)
# 개체를 이동시킨다는 점에서 시뮬레이션 유형
# 유사 : 시뮬레이션, 구현, 완전탐색

n = int(input())
x,y=1,1
plans = input().split() # 리스트로 안감싸도 split하면 리스트화.

dx = [0,0,-1,1]
dy = [-1,1,0,0]
move_types = ['L', 'R', 'U','D']

for plan in plans:
    for i in range(len(move_types)):
        if plan == move_types[i]:
            nx = x+dx[i]
            ny = y+dy[i]
    if nx < 1 or ny < 1 or nx > n or ny > n:
        continue
    x, y = nx, ny
print(x,y)