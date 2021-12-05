import sys
sys.stdin = open("1-5.txt","rt")

# 처음 문제를 봤을때 기억으로는 끝나는 시간 기준으로
# 정렬 후에 푸는 것이였는데...
# 문제를 그리디로 푸니... 이게 맞나??
n = int(input())

a = list(tuple(map(int,input().split())) for _ in range(n))

result = 0
for i in range(n):
    cnt = 1
    start = a[i][0]
    end = a[i][1]
    for j in range(i+1, n):
        if end <= a[j][0]:
            cnt+=1
            start = a[j][0]
            end = a[j][1]
    if result < cnt:
        result = cnt
print(result)
