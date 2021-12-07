import sys
sys.stdin = open("4-7.txt", "r")

def isValid(x):
    a = []
    for i in sub:
        a.append(x.index(i))
    for i in range(1,len(a)):
        if a[i-1] < a[i]:
            continue
        else:
            return False
    return True
        

sub = input()
n = int(input())

for i in range(n):
    s = input()
    if isValid(s):
        print("#%d YES" %(i+1))
    else:
        print("#%d NO" %(i+1))
