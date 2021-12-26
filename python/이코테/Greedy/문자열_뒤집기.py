s = input()
zeroToOne = 0
oneToZero = 0

if s[0] == '1':
    zeroToOne += 1
else:
    oneToZero += 1

for i in range(len(s)-1):
    if s[i] != s[i+1]:
        if s[i+1] == '1':
            zeroToOne += 1
        else:
            oneToZero += 1
print(min(zeroToOne, oneToZero))
        