import sys
sys.stdin = open("1-2.txt", "rt")

t = int(input());
print(t)

for i in range(t):
    N, s, e, k = map(int, input().split())
    arr = list(map(int, input().split()))
    anwser = arr[s-1:e]
    anwser.sort()
    print(anwser[k-1])