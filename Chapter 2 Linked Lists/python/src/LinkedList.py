class Node:
    def __init__(self, data):
        self.next = None
        self.data = data


class LinkedList:
    def __init__(self):
        self.head = None

    def add(self, data):
        newHead = Node(data)
        if self.head is None:
            self.head = newHead
            return
        newHead.next = self.head
        self.head = newHead


if __name__ == '__main__':
    linkBoi = LinkedList()


