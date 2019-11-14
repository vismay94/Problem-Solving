package linkedlist;

public class partitionAroundX {
    public Node partitionLinkedList(Node node, int x){
        Node head = node;
        Node tail = node;

        while(node!= null){
            Node next = node.next;
            if(node.data < x){
                node.next = head;
                head = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        return head;
    }
}
