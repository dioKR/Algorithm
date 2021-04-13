# 거스름돈으로 사용할 동전 : 500, 100, 50, 10
# INPUT - 거슬러줘야할 돈 : N원 (N은 10의 배수)
# OUTPUT - 거슬러줘야할 동전의 최소 개수 

# 내 풀이
n = int(input())
result = 0
while(n>0):
    if(n//500>0):
        result += n//500
        n = n%500
    elif(n//100>0):
        result += n//100
        n = n%100
    elif(n//50>0):
        result += n//50
        n = n%50
    else:
        result += n//10
        n = n%10
print(result)

# 답안예시
n = 1260
count = 0

coin_types = [500,100,50,10]

for coin in coin_types:
    count += n//coin
    n %= coin
print(coin)