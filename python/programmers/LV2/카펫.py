import math

def solution(brown, yellow):
    answer = []
    for i in range(1, int(math.sqrt(yellow)) + 1):
        if yellow%i==0:
            j = yellow//i
            if 2*i + 2*j + 4 == brown:
                answer.extend([j+2,i+2])
                break
    return answer


def solution2(brown, yellow):
    for i in range(1, int(yellow**(0.5)) +1):
        if yellow % i == 0:
            if 2*(i+yellow//i) == brown-4:
                return [yellow//i+2, i+2]