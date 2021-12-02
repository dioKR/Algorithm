import sys
sys.stdin = open("1-3.txt", "rt")

N, K = map(int, input().split())

arr = list(map(int, input().split()))
arr.sort(reverse=True)

# 풀이방법은 동일하나
# 중복 제거를 안했음
answer = 0
cnt = 0
for i in range(N):
    for j in range(i+1,N):
        for k in range(j+1, N):
            cnt += 1
            if cnt == K:
                answer = arr[i] + arr[j] + arr[k]
                break
print(answer)
            