# 최대점수 구하기 (냅색 알고리즘)
# 1차원으로 뒤에서부터 접근
# 메모리도 낭비되지않고 코드도 간결하다!
import sys
sys.stdin = open("7-12.txt", "r")
n, m = map(int, input().split())

dy = [0] * (m+1)

for _ in range(n):
    pv, pt = map(int, input().split())

    for j in range(m, pt-1, -1):
        dy[j] = max(dy[j-pt] + pv, dy[j])
    
print(dy[m])
