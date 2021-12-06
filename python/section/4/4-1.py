import sys
sys.stdin = open("4-1.txt", "rt")
        
num, delete = map(int, input().split())
num = list(map(int, str(num)))

stack = []

for x in num:
    while stack and delete > 0 and x > stack[-1]:
        stack.pop()
        delete-=1
    stack.append(x)

if delete != 0:
    stack = stack[:-delete]

res = ''.join(map(str,stack))
print(res)
