data = list(input())

tot = 0
arr = []
for x in data:
    if x.isdigit():
        tot += int(x)
    else:
        arr.append(x)
arr.sort()

print(''.join(arr) + str(tot))

