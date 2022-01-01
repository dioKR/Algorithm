n, m = map(int,input().split())
data = list(map(int,input().split()))

array = [0] * 11
# 무게마다 볼링공이 몇개 있는지 확인하는 작업
for x in data:
    array[x] += 1


result = 0
# A가 특정한 무게의 볼링공을 선택했을 때
# 이어서 B가 볼링공을 선택하는 경우를 차례대로 계산
# A가 무게가 1인 볼링공을 선택하는 경우의 수 : 1
# B가 나머지 볼링공중 선택하는 경우의 수 : 5-1=4
for i in range(1, m+1):
    n -= array[i] 
    result += array[i] * n 
print(result)

