# 단어 찾기

import sys
sys.stdin = open("4-8.txt", "r")

dict = {}

n = int(input())

for i in range(n):
    dict[input()] = 1;

for i in range(n-1):
    del dict[input()]

for key in dict:
    print(key)