package treesAndGraphs;

public class treeTraversal {
    public void inOrderTraversal(Node root){
        if (root == null){
            return;
        }
        inOrderTraversal(root.leftNode);
        System.out.println(root.data);
        inOrderTraversal(root.rightNode);
    }

    public void preOrderTraversal(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.data);
        preOrderTraversal(root.leftNode);
        preOrderTraversal(root.rightNode);
    }

    public void postOrderTraversal(Node root){
        if(root == null){
            return;
        }

        postOrderTraversal(root.leftNode);
        postOrderTraversal(root.rightNode);
        System.out.println(root.data);
    }
}
