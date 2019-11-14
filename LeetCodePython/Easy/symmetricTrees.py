class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root is None:
            return True

        return self.helper(root.left, root.right)

    def helper(self, leftTree, rightTree):

        if leftTree is None and rightTree is None:
            return True
        if (leftTree is None) or (rightTree is None):
            return False
        return (leftTree.val == rightTree.val) and (self.helper(leftTree.right, rightTree.left)) and (
            self.helper(leftTree.left, rightTree.right))