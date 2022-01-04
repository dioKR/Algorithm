s = list(map(int,input()))
tot = sum(s)
tmp = 0
for i in range(len(s)//2):
    tmp += s[i]
if tot//2 == tmp:
    print("LUCKY")
else:
    print("READY")