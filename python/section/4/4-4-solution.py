import sys
sys.stdin = open("4-4.txt", "r")
a = input()
stack = []

for x in a:
    if x.isdecimal():
        stack.append(int(x))
    else:
        if x== "+":
            n1=stack.pop()
            n2=stack.pop()
            stack.append(n1+n2)
        elif x=="-":
            n1=stack.pop()
            n2=stack.pop()
            stack.append(n2-n1)
        elif x=="*":
            n1=stack.pop()
            n2=stack.pop()
            stack.append(n1*n2)
        elif x=="/":
            n1=stack.pop()
            n2=stack.pop()
            stack.append(n2/n1)
print(stack[0])