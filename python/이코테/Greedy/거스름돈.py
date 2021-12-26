coin_types = [500, 100, 50, 10]
n = 1260

def solution(n):
    answer = 0
    for i in coin_types:
        if N >= i:
            answer += N//i
            N = N%i
    return answer

# 화폐의 값이 현재의 잔액보다 크다면 
# 몫의 값은 0 이므로 count에는 영향이 없고
# 나머지 값 역시 그대로 유지되기 때문에 if문을 안거쳐도 된다.
count = 0
for coin in coin_types:
    count += n//coin
    n %= coin
print(count)    
    
print(solution(n))