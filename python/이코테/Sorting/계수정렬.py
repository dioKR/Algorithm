# 특정한 조건이 부합할 때만 사용할 수 있지만
# 매우 빠르게 동작하는 정렬 알고리즘
# 계수 정렬은 데이터의 크기 범위가 제한되어 
# 정수형태로 표현할수 있을 때 사용 가능
# 데이터의 개수가 N, 데이터 중 최대값이 K일때
# 최악의 경우에도 O(N+K)
# 공간복잡도 : O(N+K)
arr = [7,5,9,0,3,1,6,2,9,1,4,8,0,5,2]

count = [0] * 10

for i in range(len(arr)):
    count[arr[i]] += 1

for i in range(len(count)):
    for _ in range(count[i]):
        print(i, end= " ")