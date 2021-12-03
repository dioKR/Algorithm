# 두 리스트 합치기
import sys
sys.stdin = open("1-4.txt", "rt")

_list = []

n = input()
_list.extend(list(map(int, input().split())))
m = input()
_list.extend(list(map(int, input().split())))

_list.sort()
print(_list)