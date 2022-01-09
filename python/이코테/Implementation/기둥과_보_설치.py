n = 5
build_frame = [
    [1,0,0,1],
    [1,1,1,1],
    [2,1,0,1],
    [2,2,1,1],
    [5,0,0,1],
    [5,1,0,1],
    [4,2,1,1],
    [3,2,1,1],
]

def possible(answer):
    for x,y,stuff in answer:
        if stuff == 0: # 기둥일때
            if y == 0 or [x-1,y,1] in answer or [x,y,1] in answer or [x,y-1,0] in answer:
                # 바닥이거나 시작지점이 보이거나, 현재위치가 보이거나, 바로 아래 기둥이라면 계속해서 진행
                continue
            return False
        elif stuff == 1: # 보일때
            if [x,y-1,0] in answer or [x+1,y-1,0] in answer or ([x-1,y,1] in answer and [x+1,y,1] in answer):
                # 바로아래가 기둥이거나 오른쪽아래가 기둥이거나 나의 양옆이 보라면 계속해서 진행
                continue
            return False
    return True 

def solution(n, build_frame):
    answer = []
    for frame in build_frame:
        x, y, stuff, operate = frame
        if operate == 0: # 삭제
            answer.remove([x,y,stuff])
            if not possible(answer):
                answer.append([x,y,stuff])
        if operate == 1: # 설치
            answer.append([x,y,stuff])
            if not possible(answer):
                answer.remove([x,y,stuff])
    return sorted(answer)

print(solution(n, build_frame))