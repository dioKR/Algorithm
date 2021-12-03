# 파이썬 내용정리

### ✅ 파일 읽어오기

```python
import sys
sys.stdin = open("input.txt", "rt")

a = input() # 1. input() 호출 시마다 input.txt의 한줄을 읽고 cursor가 다음줄로 넘어간다.
b = input() # 2. 다음줄이 b에 저장된다.

```

<br>

### ✅ 문자열 확인 하기

- 주어진 문자열이 숫자로 되어있는지 검사하는 함수

  - isdecimal() : 오직 숫자모양의 글자만을 숫자로 판단
  - isdigit() : 숫자 모양처럼 생겼으면 숫자로 판단 ex) 3²
  - isnumeric() : 숫자값 표현에 해당하는 문자열까지 숫자로 판단 ex) 제곱근, 분수, 거듭제곱

- 주어진 문자열이 알파벳인지 검사하는 함수
  - isalpha : 공백, 숫자 포함시 False 리턴
