n = 5
lost = [2,4]
reserve = [3]


def solution(n, lost, reserve):
    answer = 0

    _reserve = [r for r in reserve if  r not in lost]
    _lost = [l for l in lost if l not in reserve]

    for i in _reserve:
        left = i - 1
        right = i + 1

        if left in _lost:
            _lost.remove(left)
        elif right in _lost:
            _lost.remove(right)
    return n - len(_lost)



    return answer


print(solution(n,lost, reserve))