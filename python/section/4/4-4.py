import sys
sys.stdin = open("4-4.txt", "r")

a = input()
stack = []

for x in a:
    if x.isdecimal():
        stack.append(x)
    else:
        num1 = int(stack.pop())
        num2 = int(stack.pop())
        if x == "+":
            stack.append(num1 + num2)
        elif x == "-":
            stack.append(num2 - num1)
        elif x == "*":
            stack.append(num1 * num2)
        elif x == "/":
            stack.append(num2 / num1)
print(stack[0])
        