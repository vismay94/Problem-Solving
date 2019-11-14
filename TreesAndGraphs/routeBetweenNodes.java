//package treesAndGraphs;
//
//import com.sun.corba.se.impl.orbutil.graph.Graph;
//
//import java.util.LinkedList;
//
//public class routeBetweenNodes {
//
//    public Boolean checkPath(Graph g, Node start, Node end){
//        LinkedList<Node> path = new LinkedList<>();
//        if(start == end){
//            return true;
//        }
//
//        for(Node u: getNodes()){
//            u.state = 0;  // ) represents Unvisited Nodes
//        }
//
//        start.state = 1;  // 1 presents VISITING node.
//
//        path.add(start);
//        Node u;
//
//        while(!path.isEmpty()){
//            u = path.removeFirst();
//            if(u != null){
//                for (Node v : getAdjacent(u)){
//                    if(v.state == 0){
//                        if(v == end){
//                            return true;
//                        }
//                        v.state = 1;
//                        path.add(v);
//                    }
//
//
//                }
//            }
//        }
//
//
//
//    }
//
//    public Node getNodes(){
//        //Code to get All the node one by one
//        Node u = new Node(0);
//        return u;
//    }
//    public Node getAdjacent(Node u){
//        // code to provide Adjacent node
//        return null;
//    }
//}
