# K번째 약수
import sys
sys.stdin = open("1-1.txt", "rt");

input = input()
p, q = map(int, input.split(" "));

def solution(p,q):
    cnt = 0
    for i in range(1, p+1):
        if p%i == 0:
            cnt += 1
        if cnt == q:
            return i
    else:
        return -1

print(solution(p,q))
