# Head is not given.Only specific node is given to delete.

class Solution(object):
    def deleteNode(self, node):
        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        while node.next.next is not None:
            node.val = node.next.val
            node = node.next
        node.val = node.next.val
        node.next = None


# Simple Method
class Solution:
    def deleteNode(self, node):
        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        if node is not None:
            node.val = node.next.val
            node.next = node.next.next
