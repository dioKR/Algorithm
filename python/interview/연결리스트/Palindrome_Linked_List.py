import collections
from typing import Deque, List, Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

head = ListNode(1, ListNode(2,  ListNode(2, ListNode(1, None))))
    
def solution(head: Optional[ListNode]) -> bool:
    q: List = []
    if not head:
        return True
    
    node = head
    while node is not None:
        q.append(node.val)
        node = node.next
    
    while len(q) > 1:
        if q.pop(0) != q.pop():
            return False
    
    return True

def isPalindrome(head: Optional[ListNode]) -> bool:
    q: Deque = collections.deque()

    if not head:
        return True

    node = head
    while node is not None:
        q.append(node.val)
        node = node.next

    while len(q) > 1:
        if q.popleft() != q.pop():
            return False
    return True

def isPalindrome2(head: ListNode) -> bool:
    rev = None
    slow = fast = head

    while fast and fast.next:
        fast = fast.next.next
        rev, rev.next, slow = slow, rev, slow.next
    if fast:
        slow = slow.next
    
    while rev and rev.val == slow.val:
        slow, rev = slow.next, rev.next

    return not rev

print(isPalindrome2(head))