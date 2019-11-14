package treesAndGraphs;

public class MinimalTree {

    public Node createBST(int low, int high, int[] values){
        if(low > high){
            return null;
        }

            int mid = (low + high) / 2;
            Node root = new Node(mid);

            root.leftNode = createBST(low,mid-1,values);
            root.rightNode = createBST(mid+1,low,values);
            return root;
    }

}
