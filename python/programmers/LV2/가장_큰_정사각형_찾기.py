def solution(board):
    row = len(board)
    col = len(board[0])

    dp = [[0] * col for _ in range(row)]
    dp[0] = board[0]

    for i in range(1,row):
        dp[i][0] = board[i][0]

    for i in range(1,row):
        for j in range(1,col):
            if board[i][j] == 1:
                dp[i][j] = min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]) + 1
    
    answer = 0
    for i in range(row):
        tmp = max(dp[i])
        answer = max(answer, tmp)

    return answer ** 2