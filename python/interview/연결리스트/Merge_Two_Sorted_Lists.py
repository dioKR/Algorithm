# 두 정렬 리스트의 병합
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

a = ListNode(1,ListNode(2,ListNode(4,None))) 
b = ListNode(1,ListNode(3,ListNode(4,None)))


def mergeTwoLists(l1: ListNode, l2: ListNode) -> ListNode:
    if (not l1) or (l2 and l1.val > l2.val):
        l1, l2 = l2, l1
    
    if l1:
        l1.next = mergeTwoLists(l1.next, l2)
    
    return l1

print(mergeTwoLists(a,b))