import sys
sys.stdin = open("5-12.txt","r")
input = sys.stdin.readline


if __name__ == "__main__":
    n, m = map(int,input().split())

    MAP = list(([0] * n) for _ in range(n))
    
    for i in range(m):
        a, b, v = map(int,input().split())
        MAP[a-1][b-1] = v
    
    for i in range(n):
        for j in range(n):
            print(MAP[i][j], end=" ")
        print()