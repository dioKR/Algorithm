# 두 수의 덧셈

from typing import List, Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


l1 = ListNode(2, ListNode(4, ListNode(3, None)))
l2 = ListNode(5, ListNode(6, ListNode(4, None)))


def reverseList(head:ListNode) -> ListNode:
    node, prev = head, None
    while node:
        next, node.next = node.next, prev
        prev, node = node, next
    return prev

# 연결 리스트를 파이썬의 리스트로 만드는 함수
def toList(node:ListNode) -> List:
    list:List = []
    while node:
        list.append(node.val)
        node = node.next
    return list

# 문자열을 역순으로 연결리스트로 만드는 함수
def toReversedLinkedList(result: str) -> ListNode:
    prev:ListNode = None
    for r in result:
        node = ListNode(r)
        node.next = prev
        prev = node
    return node


def addTwoNumber(l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
    # 1. 두 리스트를 뒤집는다.
    a = reverseList(l1)
    b = reverseList(l2)    

    # 2. 두 리스트를 숫자로 만든다
    num1 = int(''.join(str(e) for e in toList(a)))
    num2 = int(''.join(str(e) for e in toList(b)))
    
    # 3. 두 숫자를 더한다
    sum = num1 + num2

    # 4. 숫자를 다시 연결 리스트로 변환한다.
    return toReversedLinkedList(str(sum))
    # 