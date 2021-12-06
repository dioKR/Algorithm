import sys
sys.stdin = open("4-2.txt", "rt")

input = input()
st = []

res = 0
for i in range(len(input)):
    if input[i] == '(':
        st.append(input[i])
    else:
        if input[i-1] == '(':
            st.pop()
            res += len(st)
        else:
            st.pop()
            res += 1
print(res)
