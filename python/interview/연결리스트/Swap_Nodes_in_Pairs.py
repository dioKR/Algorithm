# 페어의 노드 스왑
from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

l = ListNode(1, ListNode(2, ListNode(3, ListNode(4, None))))


# 노드 변경이 아닌 노드 구조를 유지하면서 값만 변경하는 방법 -> 실용성과는 거리가 있다.
def swapPairs1(head: Optional[ListNode]) -> Optional[ListNode]:
    cur = head

    while cur and cur.next:
        cur.val, cur.next.val = cur.next.val, cur.val
        cur = cur.next.next
    return head

def swapPairs2(head: Optional[ListNode]) -> Optional[ListNode]:
    root = prev = ListNode(None)
    prev.next = head

    while head and head.next:
        b = head.next
        head.next = b.next
        b.next = head

        prev.next = b

        head = head.next
        prev = prev.next.next

    return root.next


#  재귀 구조로 스왑
def swapPairs(head: Optional[ListNode]) -> Optional[ListNode]:
    if head and head.next:
        p = head.next
        head.next = swapPairs(p.next)
        p.next = head
        return p
    return head