def solution(land):
    n = len(land)
    for i in range(1,n):
        for j in range(4):
            m = -987654321
            for k in range(4):
                if j==k:
                    continue
                s = land[i-1][k] + land[i][j]
                if s > m:
                    m = s
            land[i][j] = m
    return max(land[n-1])