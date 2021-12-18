a = 5
b = 3

# 나의 풀이
for _ in range(b):
    for _ in range(a):
        print("*", end="")
    print()

print()

# 다른사람 풀이
answer = ('*' * a + '\n') * b
print(answer)