import sys
sys.stdin = open("1-8.txt","rt")

n, m = map(int,input().split())
a = list(map(int,input().split()))

a.sort()
cnt = 0
while len(a):
    if a[0] + a[len(a)-1] > m:
        a.pop()
        cnt+=1    
    else:
        a.pop(0)
        a.pop()
        cnt+=1
print(cnt)