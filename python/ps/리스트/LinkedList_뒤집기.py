# 개념적 리스트와 파이썬의 리스트는 다르다.
# 개념적 리스트란?
# 중복을 허용하며 순서가 있는 연속된 데이터를 표현하는 자료구조이다.
# 배열과 달리 사용하는 중에 크기가 자동으로 조절된다.

# ArrayList와 LinkedList가 존재한다.
# ArrayList
# 추가 및 삭제 O(1) 하지만 최악의 경우에는 O(N) => (최악의경우:배열중간에 값을 넣는 경우 더 큰 배열을 만든후 복사하는 과정)
# 조회 O(1)

# LinkedList
# 추가 및 삭제 O(1) => (사실상 O(N)이다. 해당 노드를 찾아야하기 때문에 순회를 해야함)
# 조회 O(N)


class LinkedList:

    class LinkedNode:
        def __init__(self, number=None, next=None):
            self.number = number
            self.next = next
    
    def __init__(self):
        self.head = None
        self.tail = None

    def print_list(self):
        p = self.head
        while p is not None:
            print(p.number)
            p = p.next

    def add(self,number):
        node = self.LinkedNode(number)
        if self.head is None:
            self.head = node
            self.tail = node
        elif self.tail is not None:
            self.tail.next = node
            self.tail = self.tail.next

    def reverse(self):
        current = self.head
        self.prev = None
        self.next = None

        while current is not None:
            self.next = current.next
            current.next = self.prev
            self.prev = current
            current = self.next

        self.tail = self.head
        self.head = self.prev
    
    def reverse2(self):
        self.tmp = self.head
        self.head = self.reverseRecursive(self.tmp)
        self.tail = self.tmp

    def reverseRecursive(self, node:LinkedNode):
        if node is None or node.next is None:
            return node
        
        newHead = self.reverseRecursive(node.next)
        node.next.next = node
        node.next = None

        return newHead
        


l = LinkedList()
l.add(1)
l.add(2)
l.add(3)
l.print_list()
l.reverse2()
l.print_list()

