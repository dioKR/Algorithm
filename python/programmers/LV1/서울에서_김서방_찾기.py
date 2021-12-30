seoul = ["Oh", "Kim"]

def solution(seoul):
    return "김서방은 " + str(seoul.index("Kim")) + "에 있다."

def findKim(seoul):
    return "김서방은 {}에 있다".format(seoul.index("Kim"))

print(findKim(seoul))