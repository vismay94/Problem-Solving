# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        if head is None:
            return False
        if head.next is None:
            return False

        slowRunner = head
        fastRunner = head.next

        while slowRunner != fastRunner:
            if fastRunner is None or fastRunner.next is None:
                return False
            slowRunner = slowRunner.next
            fastRunner = fastRunner.next.next

        return True
#         dict = {}
#         while head is not None:
#             if head in dict:
#                 return True
#             else:
#                 dict[head] = 1

#             head = head.next
#         return False

