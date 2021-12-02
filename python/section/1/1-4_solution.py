# 선수지식 : 최솟값 구하기
arr = [5,3,7,9,2,5,2,6]
arrMin = float('inf') # TIL.1 : 무한대지정하는 방법을 배웠음
for i in range(len(arr)):
    if arr[i] < arrMin: # TIL.2 : 부등호(<=)를 이용하여 같은 값일 때 앞의 값과 뒤의 값을 선택할 수 있음
        arrMin = arr[i]




import sys
sys.stdin = open("1-4.txt", "rt")
n = int(input())
a = list(map(int, input().split()))
ave = round(sum(a)/n + 0.5) # TIL.3 : // 두개는 몫이다.

min = 2147000000 #21억 4천7백만
for idx, x in enumerate(a):
    tmp = abs(x-ave)
    if tmp < min:
        min = tmp
        score = x # 지역변수..;;
        res = idx+1
    elif tmp == min:
        if x > score:
            score=x
            res=idx+1
print(ave, res)

# TIL.4 : python의 round함수는 round_half_even 방식
# ex) round(4.500) => 4 : 짝수로 만든다, round(5.500) => 6 -> 하프지점에서는 짝수로
# 4.5에서 5로 올리는 반올림은 round_half_up 방식