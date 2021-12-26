s = input()

sum = int(s[0])
for i in range(1, len(s)):
    num = int(s[i])
    if sum <= 1 or num <= 1:
        sum += num
    else:
        sum *= num
print(sum)

    