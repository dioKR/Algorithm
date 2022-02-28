# 중복 문자 제거
s = "cbacdcbc"

# 재귀를 이용한 분리
def removeDuplicateLetters(s: str) -> str:
    for char in sorted(set(s)):
        suffix = s[s.index(char):]
        if set(s) == set(suffix):
            return char + removeDuplicateLetters(suffix.replace(char, ''))
    return ''

print(removeDuplicateLetters(s))


# 스택을 이용한 문자 제거
import collections
def removeBuplicateLettersStack(s: str) -> str:
    counter, seen, stack = collections.Counter(s), set(), []

    for char in s:
        counter[char] -= 1
        if char in seen:
            continue
        while stack and char < stack[-1] and counter[stack[-1]] > 0:
            seen.remove(stack.pop())
        stack.append(char)
        seen.add(char)
    return ''.join(stack)