s = "try hello world"

def solution(s):
    answer = []
    words = s.split(" ")
    for word in words:
        tmp = ''
        for i in range(len(word)):
            if i%2 == 0:
                tmp += word[i].upper()
            else:
                tmp += word[i].lower()
        answer.append(tmp)
    return " ".join(answer)

def toWeirdCase(s):
    return " ".join(map(lambda x: "".join([a.lower() if i % 2 else a.upper() for i, a in enumerate(x)]), s.split(" ")))