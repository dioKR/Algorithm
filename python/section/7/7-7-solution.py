# 가장 높은 탑 쌓기 (LIS응용)
import sys
sys.stdin = open("7-7.txt", "r")

# 구조체 사용
# 넓이를 내림차순
# 무게로만 비교

if __name__ == "__main__":
    n = int(input())
    bricks=[]

    for i in range(n):
        a,b,c = map(int, input().split())
        bricks.append((a,b,c))
    bricks.sort(reverse=True)
    dy=[0] * n
    dy[0] = bricks[0][1]
    res = bricks[0][1]
    for i in range(1,n):
        max_h = 0;
        for j in range(i-1, -1, -1):
            if bricks[j][2] > bricks[i][2] and dy[j] > max_h:
                max_h = dy[j]
        dy[i] = max_h + bricks[i][1]
        res = max(res, dy[i])
    print(res)