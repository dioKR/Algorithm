
# 문자열과 내장함수

msg = "It is Time"
print(msg.upper())
print(msg)
print(msg.lower())


tmp = msg.upper()
print(tmp)
print(tmp.find('T'))  # 첫번째 인덱스 번호 반환
print(tmp.count('T'))  # 지정문자 카운트
print(msg[:2])  # 0 ~ 1까지
print(msg[2:4])
print(len(msg))

for i in range(len(msg)):
    print(msg[i], end='')
print()

for i in msg:
    if i.isupper():
        print(i, end='')
print()

for i in msg:
    if i.islower():
        print(i, end='')
print()

for i in msg:
    if i.isalpha():
        print(i, end='')
print()


tmp = 'AZ'
for x in tmp:
    print(ord(x))  # 문자를 아스키코드
print()

tmp = 65
print(chr(tmp))  # 아스키코드를 문자로 변환
