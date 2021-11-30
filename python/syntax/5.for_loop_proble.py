n = int(input())

print(type(n))

for i in range(1, n+1):
    if i % 2 == 1:
        print(i)

sum = 0
for i in range(1, n+1):
    sum += i
print(sum)

for i in range(1, n+1):
    if n % i == 0:
        print(i, end=" ")
