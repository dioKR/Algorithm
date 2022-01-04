# 경우의 수 출력
input = input()
col = ord(input[0])-96
row = int(input[1])
dx = [2,2,1,-1,-2,-2,1,-1]
dy = [1,-1,2,2,1,-1,-2,-2]

count = 0
for i in range(8):
    if 0 < row + dx[i] < 9 and 0 < col + dy[i] < 9:
        count+=1
print(count)