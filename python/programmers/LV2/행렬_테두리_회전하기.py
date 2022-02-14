def solution(rows, columns, queries):
    answer = []
    board = [[0] * columns for _ in range(rows)]
    
    tmp = 1
    for i in range(rows):
        for j in range(columns):
            board[i][j] = tmp
            tmp += 1
    
    for k in queries:
        x1, y1, x2, y2 = k[0]-1, k[1]-1, k[2]-1, k[3]-1
        arr = []
        arr.append(board[x1+1][y1])
        for i in range(y1, y2):
            arr.append(board[x1][i])
        for i in range(x1, x2):
            arr.append(board[i][y2])
        for i in range(y2, y1, -1):
            arr.append(board[x2][i])
        for i in range(x2, x1+1, -1):
            arr.append(board[i][y1])
        answer.append(min(arr))
        
        index = 0
        for i in range(y1, y2):
            board[x1][i] = arr[index]
            index += 1
        for i in range(x1, x2):
            board[i][y2] = arr[index]
            index += 1
        for i in range(y2, y1, -1):
            board[x2][i] = arr[index]
            index += 1
        for i in range(x2, x1, -1):
            board[i][y1] = arr[index]
            index += 1
            
    return answer

def solution2(rows, columns, queries):
    answer = []

    board = [[i+(j)*columns for i in range(1,columns+1)] for j in range(rows)]

    for a,b,c,d in queries:
        stack = []
        r1, c1, r2, c2 = a-1, b-1, c-1, d-1

        for i in range(c1, c2+1):
            stack.append(board[r1][i])
            if len(stack) == 1:
                continue
            else:
                board[r1][i] = stack[-2]

        for j in range(r1+1, r2+1):
            stack.append(board[j][i])
            board[j][i] = stack[-2]

        for k in range(c2-1, c1-1, -1):
            stack.append(board[j][k])
            board[j][k] = stack[-2]

        for l in range(r2-1, r1-1, -1):
            stack.append(board[l][k])
            board[l][k] = stack[-2]

        answer.append(min(stack))


    return answer