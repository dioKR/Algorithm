phone_number = "01033334444"

def solution(phone_number):
    answer = '*' * (len(phone_number) - 4) + phone_number[-4:]
    return answer

print(solution(phone_number))