import sys
sys.stdin = open("4-9.txt","r")


def solution(s, dict):
    for i in s:
        if i not in dict:
            dict[i] = 1
        else:
            dict[i] += 1

def solution2(d1, d2):
    for key, value in d1.items():
        if d2[key] != value:
            return False
    else:
        return True

str1 = input()
str2 = input()

dict1 = {}
dict2 = {}

solution(str1, dict1)
solution(str2, dict2)


if solution2(dict1, dict2):
    print("YES")
else:
    print("NO")