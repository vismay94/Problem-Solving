class Solution(object):
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        depthleft = 0
        depthRight = 0
        if root is None:
            return 0
        if root.left is None and root.right is None:
            return 1
        if root.left:
            depthleft = self.maxDepth(root.left)
        if root.right:
            depthRight = self.maxDepth(root.right)
        return max(depthleft+1 , depthRight + 1)