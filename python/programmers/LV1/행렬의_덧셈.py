arr1 = [
    [1, 2],
    [3, 4],
]

arr2 = [
    [2, 2],
    [2, 2],
]

# 다른 사람 풀이
def sumMatrix(A,B):
    answer = [[c+d for c,d in zip(a,b)] for a,b in zip(A,B)]
    return answer


sumMatrix(arr1,arr2)

# 나의 풀이

for i in range(len(arr1)):
    for j in range(len(arr1[0])):
        arr1[i][j] += arr2[i][j]
print(arr1)