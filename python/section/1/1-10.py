import sys
sys.stdin = open("1-10.txt","rt")

N = int(input())
arr = list(map(int, input().split()))

result = 0
score = 1
for i in range(N):
    if arr[i] == 1:
        result += score
        score += 1
    else:
        score = 1
print(result)