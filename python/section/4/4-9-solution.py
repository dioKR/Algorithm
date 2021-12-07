import sys
sys.stdin = open("4-9.txt","r")

a = input()
b = input()

str1 = dict()
str2 = dict()

for x in a:
    str1[x] = str1.get(x, 0) + 1 # get : key-x가 있으면 key-value return 없으면 0 return

for x in b:
    str2[x] = str2.get(x, 0) + 1

for i in str1.keys():
    if i in str2.keys():
        if str1[i] != str2[i]:
            print("NO")
            break
    else:
        print("NO")
        break
else:
    print("YES")