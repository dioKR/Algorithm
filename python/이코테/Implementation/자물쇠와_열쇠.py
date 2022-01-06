key = [[0,0,0], [1,0,0],[0,1,1]]
lock = [[1,1,1], [1,1,0], [1,0,1]]

L = len(lock)
length = 3*L
board = [[0] * length for _ in range(length)]

for i in range(L):
    for j in range(L):
        board[L+i][L+j] = lock[i][j]

def solution():
    for i in range(1, len(board) - len(key) + 1):
        for j in range(1, len(board) - len(key) + 1):
            for _ in range(4):
                turn_right()
                for n in range(len(key)):
                    for m in range(len(key)):
                        board[i+n][j+m] += key[n][m]
                for k in board:
                    print(k)
                print()
                if check():
                    return True
                for n in range(len(key)):
                    for m in range(len(key)):
                        board[i+n][j+m] -= key[n][m]
    return False
                

def check():    
    for i in range(L, 2*L):
        for j in range(L, 2*L):
            if board[i][j] != 1:
                return False
    return True



def turn_right():
    global key
    result = []
    for i in range(len(key)):
        tmp = []
        for j in range(len(key)-1, -1, -1):
            tmp.append(key[j][i])
        result.append(tmp)
    key = result


if solution():
    print("true")
else:
    print("false")
