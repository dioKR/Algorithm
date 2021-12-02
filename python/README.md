# 파이썬 내용정리

### 파일 읽어오기

```python
import sys
sys.stdin = open("input.txt", "rt")

a = input() # 1. input() 호출 시마다 input.txt의 한줄을 읽고 cursor가 다음줄로 넘어간다.
b = input() # 2. 다음줄이 b에 저장된다.

```
