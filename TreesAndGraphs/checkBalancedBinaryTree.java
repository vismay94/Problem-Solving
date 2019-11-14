package treesAndGraphs;

public class checkBalancedBinaryTree {

    public Boolean isBalanced(Node root){
        if (root == null){
            return true;
        }

        int leftHeight = height(root.leftNode);
        int rightHeight = height(root.rightNode);

        if(Math.abs(leftHeight - rightHeight) <= 1
                    && isBalanced(root.leftNode)
                    && isBalanced(root.rightNode)){
            return true;
        }
        return false;
    }
    public int height(Node n){
        if(n == null){
            return 0;
        }

        return 1 + Math.max(height(n.leftNode), height(n.rightNode));
    }
}
