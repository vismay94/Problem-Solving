package treesAndGraphs;

public class validateBST {
    public Boolean validateTree(Node root){

        if (root == null){
            return true;
        }
        int minimum = Integer.MIN_VALUE;
        int maximum = Integer.MAX_VALUE;
        return treeValidate(root, minimum, maximum);
    }

    public Boolean treeValidate(Node n, int low, int high){
        if (n == null){
            return true;
        }

        if (n.data < low || n.data > high ){
            return false;
        }
        return treeValidate(n.leftNode,low, n.data) && treeValidate(n.rightNode, n.data, high);

    }
}
