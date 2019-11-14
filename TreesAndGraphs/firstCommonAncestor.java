package treesAndGraphs;

public class firstCommonAncestor {
    public Node commonAncestor(Node root, Node p, Node q){
//        Check whether both node are on Tree or not
        if(!isExist(root,p) || !isExist(root,q)){
            return root;
        }

        return ancestorHelper(root,p,q);
    }

    public Node ancestorHelper(Node root, Node p, Node q){
        if(root == null || p == null || q == null){
            return root;
        }
//Check if they are on both side, so that we can move.
        boolean pIsOnLeft = isExist(root.leftNode, p);
        boolean qIsOnLeft = isExist(root.leftNode,q);

        if(pIsOnLeft != qIsOnLeft){
            return root;
        }

        Node childSide = pIsOnLeft ? root.leftNode : root.rightNode;

        return ancestorHelper(childSide,p,q);
    }

    public Boolean isExist(Node root, Node p){
        if(root == null){
            return false;
        }
        if(root == p){
            return true;
        }
        return isExist(root.leftNode,p) || isExist(root.rightNode,p);
    }
}
