import sys
sys.stdin = open("5-1.txt", "r")

def DFS(x):
    if x > 0:
        DFS(x//2)
        print(x%2, end="")

if __name__ == "__main__":
    n = int(input())    
    DFS(n)