# 알파 코드 (DFS)
import sys
sys.stdin = open("6-6.txt","r")

def DFS(L, P):
    global cnt
    if L == N:
        cnt += 1
        for i in range(P):
            print(chr(64+res[i]), end="")
        print()
    else:
        for i in range(1,27):
            if code[L] == i:
                res[P] = i
                DFS(L+1, P+1)
            elif i >= 10 and code[L] == i//10 and code[L+1] == i%10:
                res[P] = i
                DFS(L+2, P+1)




if __name__ == "__main__":
    code = list(map(int,input()))
    N = len(code)
    code.insert(N, -1)
    res = [0] * N
    cnt = 0
    DFS(0,0)
    print(cnt)

