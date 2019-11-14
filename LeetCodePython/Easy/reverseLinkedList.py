def reverseLinkedList(head):

    if head is None or head.next is None:
        return node

    temp = reverseLinkedList(node.next)
    head.next.next = head
    head.next = null

    return temp

