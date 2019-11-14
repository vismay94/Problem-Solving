package linkedlist;

public class sumofLinkedList {

    public Node reverseOrderSumRecursion(Node l1, Node l2, int carry){
        if(l1 == null && l2 == null && carry == 0){
            return null;
        }
        Node result = new Node(-1);
        int value = carry;
        if(l1!= null){
            value = value + l1.data;
        }
        if(l2!= null){
            value = value + l2.data;
        }

        result.data = value % 10;
        if(l1!= null || l2!= null){
            Node nextNode = reverseOrderSumRecursion(l1==null ? null : l1.next, l2==null ? null:l2.next, value>10?1:0);
            result.next = nextNode;
        }
        return result;
    }
    public Node reverseOrderSumIerative(Node l1, Node l2){
        Node dummy1 = l1;
        Node dummy2 = l2;
        Node curr = new Node(-1);
        Node temp = curr;
        int carry = 0;
        while(dummy1!= null || dummy2 != null){
            int value1 = dummy1!= null ? dummy1.data:0;
            int value2 = dummy2!= null ? dummy2.data: 0;

            int sum = value1 + value2 + carry;
            carry = sum / 10;
            temp.next = new Node(sum % 10);
            temp = temp.next;
            if(l1!= null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return curr.next;
    }
}
