import sys
sys.stdin = open("4-1.txt", "rt")

# 파이썬 : list -> stack

num, m = map(int, input().split())
num = list(map(int, str(num))) # TIL
st = []
for x in num:
    while st and m > 0 and st[-1] < x:
        st.pop()
        m -= 1
    st.append(x)

if m != 0:
    st = st[:-m]

res = ''.join(map(str, st))
print(int(res))
    
