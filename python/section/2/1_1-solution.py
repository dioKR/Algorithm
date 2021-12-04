import sys
sys.stdin = open("1_1.txt","rt")

n = int(input())

# 손코딩 , 1대1 면접
for i in range(n):
    s = input()
    s=s.upper()
    size=len(s)
    for j in range(size//2):
        if s[j] != s[-1-j]:
            print("#%d NO" %(i+1))
            break;
    else:
        print("#%d YES" %(i+1))
            
