n, k = map(int,input().split())
count = 0

# 직관적인 풀이법

while (n>1):
    if n%k == 0:
        count+=1
        n //= k
    else:
        count+=1
        n-=1
print(count)

