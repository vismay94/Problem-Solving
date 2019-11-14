package linkedlist;

import java.util.HashMap;

//Put first element inside dicitonary, If we find node value pointed by temp inside dictionary
//We will use Prev to remove that node

public class removeDuplicatesLl {
    public Node removeDuplicates(Node head){
        HashMap<Integer,Integer> dictionary = new HashMap();
        dictionary.put(head.data,1);
        Node prev = head.next;
        Node temp = prev.next;
        while(temp.next != null){
            if(!dictionary.containsKey(temp.data)){
                dictionary.put(temp.data, 1);
            }
            else{
                prev.next = temp.next;
                temp = temp.next;
                prev = prev.next;

            }

        }

    return head;
    }

    public Node noBufferDuplicateRemove(Node head){
        Node current = head;
        while(current != null){
            Node fastRunner = current;
            while(fastRunner.next != null){
                if(fastRunner.next.data == current.data){
                    fastRunner.next = fastRunner.next.next;
                }else{
                    fastRunner = fastRunner.next;
                }
            }
            current = current.next;
        }
        return head;

    }
}
