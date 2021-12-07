import sys
sys.stdin = open("4-9.txt","r")

a = input()
b = input()

sH = dict()

for x in a:
    sH[x] = sH.get(x, 0) + 1 # get : key-x가 있으면 key-value return 없으면 0 return

for x in b:
    sH[x] = sH.get(x, 0) - 1

for x in a:
    if sH.get(x) > 0:
        print("NO")
        break
else:
    print("YES")