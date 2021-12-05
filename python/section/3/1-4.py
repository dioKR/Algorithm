import sys
sys.stdin = open("1-4.txt", "rt")

n, c = map(int,input().split())

a = [int(input()) for _ in range(n)]
a.sort()
print(a)

