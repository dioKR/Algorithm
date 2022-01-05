s = "abcabcdede"
def solution(s):
    answer = 99999
    
    if len(s) == 1:
        return 1
    
    for i in range(1, len(s)//2+1):
        prev = s[:i]
        cnt = 1
        tmp = ""
        for j in range(i, len(s), i):
            cur = s[j:j+i]
            if prev == cur:
                cnt += 1
            else:
                if cnt != 1:
                    tmp += (str(cnt) + prev)
                else:
                    tmp += prev
                cnt = 1
            prev = cur
        if cnt != 1:
            tmp += (str(cnt) + prev)
        else:
            tmp += prev
        answer = min(len(tmp), answer)
    return answer