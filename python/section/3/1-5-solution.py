# 회의실 배정
# 그리디는 대부분 정렬과 동반된 문제풀이
# 끝나는 시간으로 정렬

import sys
sys.stdin = open("1-5.txt","rt")

n = int(input())
meeting = []
for i in range(n):
    s, e = map(int, input().split())
    meeting.append((s,e))

meeting.sort(key = lambda x : (x[1], x[0]))

et = 0 # end time
cnt = 0

for s, e in meeting:
    if s >= et:
        et = e
        cnt += 1
print(cnt)