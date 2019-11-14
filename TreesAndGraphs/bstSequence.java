package treesAndGraphs;

import java.util.LinkedList;

public class bstSequence {
        public LinkedList<LinkedList<Node>> allSeqs;

        public bstSequence(Node root) {
            allSeqs = new LinkedList<>();
            LinkedList<Node> pre = new LinkedList<>();
            LinkedList<Node> poss = new LinkedList<>();

            buildSeqs(pre, poss, root);
            for (LinkedList<Node> ll : allSeqs) {
                for (Node n : ll) {
                    System.out.print(n.data + " ");
                }
                System.out.println();
            }
        }

        private void buildSeqs(LinkedList<Node> pre, LinkedList<Node> poss, Node root) {
            pre.add(root);
            if (root.leftNode!= null) {
                poss.add(root.leftNode);
            }
            if (root.rightNode != null) {
                poss.add(root.rightNode);
            }

            if (poss.isEmpty()) {
                allSeqs.add(pre);
            }

            for (Node n: poss) {
                LinkedList<Node> temp = (LinkedList<Node>) pre.clone();
                LinkedList<Node> ptemp = (LinkedList<Node>) poss.clone();
                ptemp.remove(n);
                buildSeqs(temp, ptemp, n);
            }
        }

        public static void main(String[] args) {
            Node root = new Node(10);
            root.leftNode = new Node(5);
            root.rightNode = new Node(15);
            root.leftNode.rightNode = new Node(7);
            root.leftNode.leftNode = new Node(3);

            bstSequence all = new bstSequence(root);
        }
    }
