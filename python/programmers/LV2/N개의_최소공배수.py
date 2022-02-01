arr = [2,6,8,14]

def gcd(a,b):
    if b == 0:
        return a
    else:
        return gcd(b, a%b)


def solution(arr):
    answer = arr[0]
    for a in arr:
        answer = a * answer / gcd(a, answer)
    return answer

print(solution(arr))