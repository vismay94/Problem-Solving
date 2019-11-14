class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        result = []
        self.helper(root, result)
        return result

    def helper(self, node, result):
        if node is None:
            return
        if node.left:
            self.helper(node.left, result)
        result.append(node.val)
        if node.right:
            self.helper(node.right, result)



