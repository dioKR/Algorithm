record = [
    "Enter uid1234 Muzi", 
    "Enter uid4567 Prodo",
    "Leave uid1234",
    "Enter uid1234 Prodo",
    "Change uid4567 Ryan"
]

def solution2(records):
    answer = []
    dict = {}

    for record in records:
        r = record.split() # 커맨드/유저아이디/닉네임
        if len(r) == 3:
            command, id, nickName = r
        else:
            command, id = r
        
        if command == "Enter":
            if id in dict:
                dict[id] = nickName
                for i in range(len(answer)):
                    if answer[i][1] == id:
                        answer[i][2] = dict[id]
                answer.append([command, id, dict[id]])
            else:
                dict[id] = nickName
                answer.append([command, id, dict[id]])
        elif command == "Leave":
            answer.append([command, id, dict[id]])
        elif command == "Change":
            dict[id] = nickName
            for i in range(len(answer)):
                if answer[i][1] == id:
                    answer[i][2] = dict[id]

    result = []
    for i in answer:
        if i[0] == "Enter":
            result.append(i[2] + "님이 들어왔습니다.")
        else:
            result.append(i[2] + "님이 나갔습니다.")
    
    return result


def solution(records):
    answer = []
    userDB = {}
    commands = []

    for record in records:
        r = record.split() # 커맨드/유저아이디/닉네임
        command, id = r[0], r[1]
        
        if command in ("Enter", "Change"):
            nickName = r[2]
            userDB[id] = nickName
        commands.append((command, id))
    
    for c in commands:
        command, id = c[0], c[1]
        if command == "Enter":
            answer.append(userDB[id] + "님이 들어왔습니다.")
        elif command == "Leave":
            answer.append(userDB[id] + "님이 나갔습니다.")
    return answer